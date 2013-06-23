package com.bt.apprentice.numberstowords;

public class NumbersToWords {
  private static final String[] NUMBERS_UP_TO_19 = { "zero", "one", "two",
      "three", "four", "five", "six", "seven", "eight", "nine", "ten",
      "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
      "seventeen", "eighteen", "nineteen" };
  private static final String[] MULTIPLES_OF_10 = { "", "", "twenty", "thirty",
      "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
  private final int number;
  private StringBuffer result = new StringBuffer();

  public static String convert(final int number) {
    return new NumbersToWords(number).convert();
  }

  public NumbersToWords(final int number) {
    this.number = number;
  }

  public String convert() {
    if (number == 0) {
      return ("zero");
    }

    final int thousands = number / 1000;
    int remainder = number - thousands * 1000;
    final int hundreds = remainder / 100;
    final int tensAndUnits = remainder - hundreds * 100;

    if (thousands > 0) {
      append(convertTensAndUnits(thousands) + " thousand");
    }
    if (hundreds > 0) {
      append(convertHundreds(hundreds));
    }
    if (tensAndUnits > 0) {
      appendWithAnd(convertTensAndUnits(tensAndUnits));
    }
    return result.toString();
  }

  private void append(final String words) {
    appendWithSeparator(words, " ");
  }

  private void appendWithAnd(final String words) {
    appendWithSeparator(words, " and ");
  }

  private void appendWithSeparator(final String words, final String separator) {
    if (result.length() > 0) {
      result.append(separator);
    }
    result.append(words);
  }

  private String convertHundreds(final int hundreds) {
    return NUMBERS_UP_TO_19[hundreds] + " hundred";
  }

  private String convertTensAndUnits(final int number) {
    final int tens = number / 10;
    final int units = number - tens * 10;

    if (number < 20) {
      return NUMBERS_UP_TO_19[number];
    } else if (units == 0) {
      return MULTIPLES_OF_10[tens];
    } else {
      return MULTIPLES_OF_10[tens] + "-" + NUMBERS_UP_TO_19[units];
    }
  }
}