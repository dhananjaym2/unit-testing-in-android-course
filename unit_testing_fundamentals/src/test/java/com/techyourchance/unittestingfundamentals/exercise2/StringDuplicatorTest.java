package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

  StringDuplicator SUT;

  @Before
  public void setUp() throws Exception {
    SUT = new StringDuplicator();
  }

  @Test
  public void duplicateString_emptyString_emptyStringReturned() {
    String result = SUT.duplicate("");
    assertThat(result, is(""));
  }

  @Test
  public void duplicateString_singleCharacter_sameCharacterReturned() {
    String result = SUT.duplicate("a");
    assertThat(result, is("aa"));
  }

  @Test
  public void duplicateString_longString_duplicateLongString() {
    String result = SUT.duplicate("Example");
    assertThat(result, is("ExampleExample"));
  }
}