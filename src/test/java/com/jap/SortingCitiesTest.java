package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortingCitiesTest {
    // Declare the object to call the method in SortingCities.java class
    SortingCities sortingCities;

    @BeforeEach
    public void setUp() {
        // Initialise the object to call the methods in SortingCities class
        sortingCities = new SortingCities();
    }

    @AfterEach
    public void tearDown() {
        // Make the sortingCities object null
        sortingCities = null;
    }

    // Write all the test cases here
    // Test case for the method convertToUpperCase() to check the output
    @Test
    public void convertToUpperCaseSuccess() {
        String[] expectedOutput = {"BERN", "LUCERNE", "INTERLAKEN", "MURREN"};
        String[] actualOutput = sortingCities.convertToUpperCase(new String[]{"Bern", "LuCeRnE", "interLaken", "MuRreN"});
        Assertions.assertArrayEquals(expectedOutput, actualOutput, "There is some error in the logic");
    }

    // Test case for the method convertToUpperCase() to check the output for a null string
    @Test
    public void convertToUpperCaseFailure() {
        String[] actualOutput = sortingCities.convertToUpperCase(new String[]{""});
        Assertions.assertArrayEquals(null, actualOutput, "There is some error in the logic");
    }
}