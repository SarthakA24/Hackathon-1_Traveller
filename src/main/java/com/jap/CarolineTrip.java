package com.jap;


import java.util.Arrays;

public class CarolineTrip {
    public static void main(String[] args) {
        // Declare the 2 arrays with city names and distances from Zurich
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        // Print the original arrays of distance and city names
        System.out.println("-------------------------------------");
        System.out.println("City Names and Distance (Un-Sorted) -- ");
        System.out.println("City Name || Distance from Zurich");
        System.out.println("-------------------------------------");
        for (int index = 0; index < distanceFromZurich.length; index++) {
            System.out.println(cityNames[index] + ": " + distanceFromZurich[index] + " kms");
        }
        // Create an object for the method sortBasedOnDistance()
        CarolineTrip carolineTrip = new CarolineTrip();
        // Call the method to convert the city name to upper case
        cityNames = carolineTrip.convertToUpperCase(cityNames);
        // Call the method to sort the distance from Zurich arrays
        carolineTrip.sortBasedOnDistance(cityNames, distanceFromZurich);
        // Call the method city52KmFromZurich() and save the return value in a variable
        String city52KmAwayFromZurich = carolineTrip.city52KmFromZurich(cityNames, distanceFromZurich);
        // Call the method cityGreaterThanOrEqualTo270KmFromZurich() to find the city greater than or equal to 270km from Zurich
        String[] cityGreaterThanOrEqualTo270KmAwayFromZurich = carolineTrip.cityGreaterThanOrEqualTo270KmFromZurich(cityNames, distanceFromZurich);
        // Print the sorted distance and corresponding city names on the screen
        // Start a loop to iterate though the arrays and print them
        System.out.println("-------------------------------------");
        System.out.println("Sorted City Names and Distance based on Distance (Smallest to Largest) -- ");
        System.out.println("City Name || Distance from Zurich");
        System.out.println("-------------------------------------");
        for (int index = 0; index < distanceFromZurich.length; index++) {
            System.out.println(cityNames[index] + ": " + distanceFromZurich[index] + " kms");
        }
        System.out.println("---------------------------------------------------------------");
        // Print the city which is 52km away from Zurich
        System.out.println("The city which is 52kms away from Zurich is: " + city52KmAwayFromZurich);
        System.out.println("---------------------------------------------------------------");
        // Print the city which is more than 270km Away from Zurich
        System.out.println("The city/cities which is more than 270kms away from Zurich is: " + Arrays.toString(cityGreaterThanOrEqualTo270KmAwayFromZurich));
        System.out.println("---------------------------------------------------------------");
    }

    // Create a method to convert the city names in uppercase

    /**
     * This function takes an array of strings as an argument and converts each element to upper case.
     *
     * @param cityNames This is the array that we want to convert to upper case.
     */
    public String[] convertToUpperCase(String[] cityNames) {
        if (cityNames == null) {
            return null;
        } else {
            // Start a loop to iterate though the array and convert each element to upper case
            for (int index = 0; index < cityNames.length; index++) {
                cityNames[index] = cityNames[index].toUpperCase();
            }
            return cityNames;
        }
    }


    // Create a method to sort the city names based on the sorted distance array

    /**
     * The function takes two arrays as input, one containing the city names and the other containing the distance of the
     * cities from Zurich. It sorts the distance array in ascending order and swaps the values in the city array
     * accordingly
     *
     * @param sortedCityNames          This is the array of city names that will be sorted based on the distance from Zurich.
     * @param sortedDistanceFromZurich This is the array that contains the distances from Zurich.
     */
    public void sortBasedOnDistance(String[] sortedCityNames, int[] sortedDistanceFromZurich) {
        // Declare a temp variable for storing the value while swapping
        int tempDistance;
        String tempCityName;
        // Start the loop iterations te sort the array
        for (int pass = 0; pass < sortedDistanceFromZurich.length; pass++) {
            for (int index = 0; index < sortedDistanceFromZurich.length - pass - 1; index++) {
                if (sortedDistanceFromZurich[index] > sortedDistanceFromZurich[index + 1]) {
                    // Swap the numbers in distance array
                    tempDistance = sortedDistanceFromZurich[index];
                    sortedDistanceFromZurich[index] = sortedDistanceFromZurich[index + 1];
                    sortedDistanceFromZurich[index + 1] = tempDistance;
                    // Swap the values in city array
                    tempCityName = sortedCityNames[index];
                    sortedCityNames[index] = sortedCityNames[index + 1];
                    sortedCityNames[index + 1] = tempCityName;
                }
            }
        }
    }

    // Create a method to find the city which is 52 kms from Zurich

    /**
     * It takes in two arrays as input, one containing the names of cities and the other containing the distances of those
     * cities from Zurich. It returns the name of the city which is 52 kms away from Zurich
     *
     * @param cityNames          An array of city names
     * @param distanceFromZurich An array of distances of cities from Zurich
     * @return The city name which is 52 kms away from Zurich
     */
    public String city52KmFromZurich(String[] cityNames, int[] distanceFromZurich) {
        if (cityNames == null || distanceFromZurich.length <= 1) {
            return null;
        } else {
            // Declare a variable to store the city name which is 52 kms form Zurich
            String city52KmAwayFromZurich = "";
            // Start a for loop to iterate thought the array and find the distance = 52km
            for (int index = 0; index < cityNames.length; index++) {
                // If the distance is 52 km, then return the corresponding city and break from the loop
                if (distanceFromZurich[index] == 52) {
                    city52KmAwayFromZurich = cityNames[index];
                    break;
                }
            }
            // Return the variable city52KmAwayFromZurich
            return city52KmAwayFromZurich;
        }
    }

    // Create a method to find the city which is more than 270km away from Zurich

    /**
     * It takes in two arrays as input, one containing the names of cities and the other containing the distance of each
     * city from Zurich. It returns the name of the first city that is more than 270km away from Zurich
     *
     * @param cityNames          An array of city names
     * @param distanceFromZurich An array of integers that represent the distance of each city from Zurich.
     * @return The city name that is greater than or equal to 270km away from Zurich
     */
    public String[] cityGreaterThanOrEqualTo270KmFromZurich(String[] cityNames, int[] distanceFromZurich) {
        if (cityNames == null || distanceFromZurich.length < 1) {
            return null;
        } else {
            // Check the number of values of distance above 270kms using a for loop and a count variable
            int count = 0;
            for (int fromZurich : distanceFromZurich) {
                if (fromZurich >= 270) {
                    count++;
                }
            }
            int arraySize = 0;
            String[] cityGreaterThanOrEqualTo270KmAwayFromZurich = new String[count];
            // Start a loop to iterate thought the array and find the distance more than or equal to 270km
            for (int index = 0; index < cityNames.length; index++) {
                // If the distance is more than or equal to 270, store it in a variable and break out of the loop
                if (distanceFromZurich[index] >= 270) {
                    cityGreaterThanOrEqualTo270KmAwayFromZurich[arraySize] = cityNames[index];
                    arraySize++;
                }
            }
            // Return the variable cityGreaterThanOrEqualTo270KmAwayFromZurich
            return cityGreaterThanOrEqualTo270KmAwayFromZurich;
        }
    }
}
