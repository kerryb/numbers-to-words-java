package com.bt.apprentice.numberstowords;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersToWordsTest {

  @Test
  public void convertsZero() {
    assertEquals("zero", NumbersToWords.convert(0));
  }
}