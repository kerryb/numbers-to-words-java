package com.bt.apprentice.numberstowords;

public class NumbersToWords {
  private static final String[] NUMBERS_UP_TO_19 = {
    "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine",
    "ten", "eleven", "twelve", "thirteen", "fourteen",
    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
  };
  
  private static final String[] MULTIPLES_OF_10 = {
    "", "", "twenty", "thirty", "forty", "fifty",
    "sixty", "seventy", "eighty", "ninety"
  };

  public static String convert(final int number) {
    if (number < 20) {
      return NUMBERS_UP_TO_19[number];
    } else{
      return MULTIPLES_OF_10[number/10];
    }
  }
}