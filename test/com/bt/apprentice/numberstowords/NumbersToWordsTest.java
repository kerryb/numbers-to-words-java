package com.bt.apprentice.numberstowords;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersToWordsTest {

  @Test
  public void convertsZero() {
    expectConversion(0, "zero");
  }

  @Test
  public void convertsSingleDigits() {
    expectConversion(1, "one");
    expectConversion(2, "two");
    expectConversion(3, "three");
    expectConversion(4, "four");
    expectConversion(5, "five");
    expectConversion(6, "six");
    expectConversion(7, "seven");
    expectConversion(8, "eight");
    expectConversion(9, "nine");
  }

  private void expectConversion(final int number, final String expectedWords) {
    assertEquals(expectedWords, NumbersToWords.convert(number));
  }
}