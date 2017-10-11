/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.Comparator;

/**
 *
 * @author wezhou
 */
/**
 * A country with a name and area.
 */
public class Country {

    /**
     * Constructs a country.
     *
     * @param aName the name of the country
     * @param anArea the area of the country
     */
    public Country(String aName, double anArea) {
        name = aName;
        area = anArea;
    }

    /**
     * Gets the name of the country.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the area of the country.
     *
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * compares countries by the name in either increasing or decreasing order
     *
     * @param increasing, a boolean
     * @return either 1, -1, or 0
     */
    public static Comparator<Country> createComparatorByName(final boolean increasing) {

        int direction;

        if (increasing) {
            direction = 1;
        } else {
            direction = -1;
        }
        return new Comparator<Country>() {

            public int compare(Country country1, Country country2) {
                return direction * country1.getName().compareTo(country2.getName());
            }
        };
    }

    /**
     * compares countries by area in either increasing or decreasing order
     * @param increasing, a boolean
     * @return either 1, -1, or 0
     */
    public static Comparator<Country> createComparatorByArea(final boolean increasing) {

        int direction;

        if (increasing) {
            direction = 1;
        } else {
            direction = -1;
        }

        return new Comparator<Country>() {

            public int compare(Country country1, Country country2) {
                if (country1.getArea() < country2.getArea()) {
                    return -1 * direction;
                }
                if (country1.getArea() > country2.getArea()) {
                    return 1 * direction;
                }
                return 0;
            }

        };
    }

    private String name;
    private double area;
}
