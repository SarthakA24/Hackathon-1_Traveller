package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarolineTripTest {
    // Declare the object to call the method in SortingCities.java class
    CarolineTrip carolineTrip;

    @BeforeEach
    public void setUp() {
        // Initialise the object to call the methods in SortingCities class
        carolineTrip = new CarolineTrip();
    }

    @AfterEach
    public void tearDown() {
        // Make the sortingCities object null
        carolineTrip = null;
    }

    // Write all the test cases here
    // Test case for the method convertToUpperCase() to check the output
    @Test
    public void convertToUpperCaseSuccess() {
        String[] expectedOutput = {"BERN", "LUCERNE", "INTERLAKEN", "MURREN"};
        String[] actualOutput = carolineTrip.convertToUpperCase(new String[]{"Bern", "LuCeRnE", "interLaken", "MuRreN"});
        Assertions.assertArrayEquals(expectedOutput, actualOutput, "There is some error in the logic");
    }

    // Test case for the method convertToUpperCase() to check the output for a null string
    @Test
    public void convertToUpperCaseFailure() {
        String[] actualOutput = carolineTrip.convertToUpperCase(null);
        Assertions.assertArrayEquals(null, actualOutput, "There is some error in the logic");
    }

    // Test case for the method city52KmFromZurich to find the city with distance of 52 km from Zurich
    @Test
    public void city52KmFromZurichSuccess() {
        String expectedOutput = "Lucerne";
        String actualOutput = carolineTrip.city52KmFromZurich(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"}, new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101});
        Assertions.assertEquals(expectedOutput, actualOutput, "There is some error in the logic");
    }

    // Test case for the method city52KmFromZurich to return null for incorrect inputs
    @Test
    public void city52KmFromZurichFailure() {
        Assertions.assertNull(carolineTrip.city52KmFromZurich(null, new int[]{0}), "There is some error in logic");
        Assertions.assertNull(carolineTrip.city52KmFromZurich(null, new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101}), "There is some error in logic");
        Assertions.assertNull(carolineTrip.city52KmFromZurich(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"}, new int[]{0}), "There is some error in logic");
    }

    // Test case for the method cityGreaterThanOrEqualTo270KmFromZurich to find the city with distance of more than 270kms from Zurich
    @Test
    public void cityGreaterThanOrEqualTo270KmFromZurichSuccess() {
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 270, 87, 214, 280};
        String[] expectedOutput = {"Geneva", "Murren", "Jungfraujoch"};
        String[] actualOutput = carolineTrip.cityGreaterThanOrEqualTo270KmFromZurich(cityNames, distanceFromZurich);
        Assertions.assertArrayEquals(expectedOutput, actualOutput, "There is some error in the logic");
    }

    // Test case for the method cityGreaterThanOrEqualTo270KmFromZurich to return null for incorrect inputs
    @Test
    public void cityGreaterThanOrEqualTo270KmFromZurichFailure() {
        Assertions.assertNull(carolineTrip.cityGreaterThanOrEqualTo270KmFromZurich(null, new int[]{}), "There is some error in the logic");
        Assertions.assertNull(carolineTrip.cityGreaterThanOrEqualTo270KmFromZurich(null, new int[]{}), "There is some error in the logic");
        Assertions.assertNull(carolineTrip.cityGreaterThanOrEqualTo270KmFromZurich(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"}, new int[]{}), "There is some error in logic");
    }

    // Test case for the method sortBasedOnDistance() to check the sorting logic
    @Test
    public void sortBasedOnDistanceSuccess() {
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String[] expectedCityOutput = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "Interlaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int[] expectedDistanceOutput = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        carolineTrip.sortBasedOnDistance(cityNames, distanceFromZurich);
        Assertions.assertArrayEquals(expectedCityOutput, cityNames, "There is some error in the logic");
        Assertions.assertArrayEquals(expectedDistanceOutput, distanceFromZurich, "There is some error in the logic");
    }
}