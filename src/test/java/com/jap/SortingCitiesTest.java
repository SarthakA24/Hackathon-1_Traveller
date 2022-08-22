package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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

    //write all the test cases here
}