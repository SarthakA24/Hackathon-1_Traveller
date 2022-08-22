package com.jap;

import org.junit.After;
import org.junit.Before;

public class SortingCitiesTest {
    // Declare the object to call the method in SortingCities.java class
    SortingCities sortingCities;

    @Before
    public void setUp() {
        // Initialise the object to call the methods in SortingCities class
        sortingCities = new SortingCities();
    }

    @After
    public void tearDown() {
        // Make the sortingCities object null
        sortingCities = null;
    }

    //write all the test cases here
}