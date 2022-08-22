package com.jap;

import org.junit.jupiter.api.AfterEach;
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
    void convertToUpperCaseSuccess() {
        String[] expectedOutput = {"BERN", "LUCERN", "INTERLAKEN", "MURREN"};
        //Assertions.assertEquals();
    }
}