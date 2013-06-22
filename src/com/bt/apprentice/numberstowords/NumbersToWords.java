package com.bt.apprentice.numberstowords;

public class NumbersToWords {
  private static final String[] NUMBERS_UP_TO_19 = { "zero", "one", "two",
      "three", "four", "five", "six", "seven", "eight", "nine", "ten",
      "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
      "seventeen", "eighteen", "nineteen" };

  private static final String[] MULTIPLES_OF_10 = { "", "", "twenty", "thirty",
      "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

  public static String convert(final int number) {
    final int hundreds = number / 100;
    final int tensAndUnits = number - hundreds * 100;
    if (number >= 100) {
      if (tensAndUnits == 0) {
        return convertHundreds(number);
      } else {
        return convertHundreds(number) + " and "
            + convertTensAndUnits(tensAndUnits);
      }
    } else {
      return convertTensAndUnits(number);
    }
  }

  private static String convertHundreds(final int number) {
    return NUMBERS_UP_TO_19[number / 100] + " hundred";
  }

  private static String convertTensAndUnits(final int number) {
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