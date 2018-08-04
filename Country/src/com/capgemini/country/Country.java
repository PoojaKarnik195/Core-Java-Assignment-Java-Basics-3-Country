
package com.capgemini.country;

//calculates the country with largest area, population and population density
public class Country {

	String countryname[] = new String[15];
	int area[] = new int[15];
	int population[] = new int[15];
	int populationDensity[] = new int[15];

	// parameterized constructor which accepts country names,area and population
	Country(String countryname[], int area[], int population[]) {

		this.countryname = countryname;
		this.area = area;
		this.population = population;
	}

	// calculates largest area
	int getArea() {

		int i = 0;
		if ((area[i] > area[i + 1]) && (area[i] > area[i + 2])) {
			return i;
		} else if (area[i + 1] > area[i + 2]) {
			return (i + 1);
		} else {
			return (i + 2);
		}
	}

	// calculates largest population
	int getPopulation() {

		int i = 0;
		if ((population[i] > population[i + 1]) && (population[i] > population[i + 2])) {
			return i;
		} else if (population[i + 1] > population[i + 2]) {
			return (i + 1);
		} else {
			return (i + 2);
		}
	}

	// calculates largest population density
	int getPopulationDensity() {

		int i;
		for (i = 0; i < 3; i++) {
			populationDensity[i] = population[i] / area[i];
		}

		int j = 0;
		if ((populationDensity[j] > populationDensity[j + 1]) && (populationDensity[j] > populationDensity[j + 2])) {
			return j;
		} else if (populationDensity[j + 1] > populationDensity[j + 2]) {
			return (j + 1);
		} else {
			return (j + 2);
		}
	}
}
