package com.bt.apprentice.numberstowords;

public class NumbersToWords {
  private static final String[] NUMBERS_UP_TO_19 = { "zero", "one", "two",
      "three", "four", "five", "six", "seven", "eight", "nine", "ten",
      "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
      "seventeen", "eighteen", "nineteen" };

  private static final String[] MULTIPLES_OF_10 = { "", "", "twenty", "thirty",
      "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

  public static String convert(final int number) {
    if (number >= 100) {
      return NUMBERS_UP_TO_19[number/100] + " hundred";
    } else if (number < 20) {
      return NUMBERS_UP_TO_19[number];
    } else {
      final int tens = number / 10;
      final int units = number - tens * 10;
      if (units == 0) {
        return MULTIPLES_OF_10[tens];
      } else {
        return MULTIPLES_OF_10[tens] + "-"
            + NUMBERS_UP_TO_19[units];
      }
    }
  }
}