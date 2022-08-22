package com.jap;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        // Declare the 2 arrays with city names and distances from Zurich
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceFromZurich = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }

    // Create a method to sort the arrays based on the distances
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
