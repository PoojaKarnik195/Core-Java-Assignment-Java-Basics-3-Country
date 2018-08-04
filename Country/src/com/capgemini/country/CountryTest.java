
package com.capgemini.country;

import java.util.*;

/**
 * @author Pooja Karnik Program to calculate the country with largest area,
 *         population and population density
 *
 */
//testing to find country with largest area, population and population density
public class CountryTest {

	// taking names of countries, their areas and population and passing them to
	// their respective functions to calculate largest area, population and
	// population density
	public static void main(String[] args) {

		int i;

		Scanner scanner = new Scanner(System.in);
		String countryname[] = new String[15];
		int area[] = new int[15];
		int population[] = new int[15];

		System.out.println("Enter 3 country names ");
		for (i = 0; i < 3; i++) {
			countryname[i] = scanner.next();
		}
		for (i = 0; i < 3; i++) {
			System.out.println("Enter the areas of country " + (i + 1));
			area[i] = scanner.nextInt();
		}
		for (i = 0; i < 3; i++) {
			System.out.println("Enter the population of country " + (i + 1));
			population[i] = scanner.nextInt();
		}

		Country country1 = new Country(countryname, area, population);

		int position1 = country1.getArea();

		if (position1 == 0) {
			System.out.println("The country with the largest area " + countryname[0]);
		}
		if (position1 == 1) {
			System.out.println("The country with the largest area " + countryname[1]);
		}
		if (position1 == 2) {
			System.out.println("The country with the largest area " + countryname[2]);
		}

		int position2 = country1.getPopulation();

		if (position2 == 0) {
			System.out.println("The country with the largest population " + countryname[0]);
		}
		if (position2 == 1) {
			System.out.println("The country with the largest population " + countryname[1]);
		}
		if (position2 == 2) {
			System.out.println("The country with the largest population " + countryname[2]);
		}

		int position3 = country1.getPopulationDensity();

		if (position3 == 0) {
			System.out.println(
					"The country with the largest population density (people per square mile) " + countryname[0]);
		}
		if (position3 == 1) {
			System.out.println(
					"The country with the largest population density (people per square mile) " + countryname[1]);
		}
		if (position3 == 2) {
			System.out.println(
					"The country with the largest population density (people per square mile) " + countryname[2]);
		}
	}
}
