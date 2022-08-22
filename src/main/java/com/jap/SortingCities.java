package com.jap;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        // Declare the 2 arrays with city names and distances from Zurich
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        // Create an object for the method sortBasedOnDistance()
        SortingCities sortingCities = new SortingCities();
        // Call the method to convert the city name to upper case
        sortingCities.convertToUpperCase(cityNames);
        // Call the method to sort the arrays
        sortingCities.sortBasedOnDistance(cityNames, distanceFromZurich);
    }

    // Create a method to convert the city names in uppercase

    /**
     * This function takes an array of strings as an argument and converts each element to upper case.
     *
     * @param cityNames This is the array that we want to convert to upper case.
     */
    public void convertToUpperCase(String[] cityNames) {
        // Start a loop to iterate though the array and convert each element to upper case
        for (int index = 0; index < cityNames.length; index++) {
            cityNames[index] = cityNames[index].toUpperCase();
        }
    }

    // Create a method to sort the arrays based on the distances

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
        for (int indexOne = 0; indexOne < sortedDistanceFromZurich.length; indexOne++) {
            for (int indexTwo = 0; indexTwo < sortedDistanceFromZurich.length - indexOne - 1; indexTwo++) {
                if (sortedDistanceFromZurich[indexTwo] > sortedDistanceFromZurich[indexTwo + 1]) {
                    // Swap the numbers in distance array
                    tempDistance = sortedDistanceFromZurich[indexTwo];
                    sortedDistanceFromZurich[indexTwo] = sortedDistanceFromZurich[indexTwo + 1];
                    sortedDistanceFromZurich[indexTwo + 1] = tempDistance;
                    // Swap the values in city array
                    tempCityName = sortedCityNames[indexTwo];
                    sortedCityNames[indexTwo] = sortedCityNames[indexTwo + 1];
                    sortedCityNames[indexTwo + 1] = tempCityName;
                }
            }
        }
    }
}
