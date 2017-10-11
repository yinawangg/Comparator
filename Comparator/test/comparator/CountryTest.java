/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import static comparator.Country.createComparatorByArea;
import static comparator.Country.createComparatorByName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wezhou
 */
public class CountryTest {

    public CountryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Country instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Country instance = null;
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public static void testCreateComparatorByName() {
        System.out.println("\ncreateComparatorByName in reverse " +
                "alphabetical order");

        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));

        Comparator<Country> compName = createComparatorByName(false);
        Collections.sort(countries, compName);
         for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public static void testCreateComparatorByArea() {
        System.out.println("\ncreateComparatorByArea by decreasing area");

        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        
        Comparator<Country> compArea = createComparatorByArea(false);
        Collections.sort(countries, compArea);
         for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public static void main (String[] args){
        testCreateComparatorByName();
        testCreateComparatorByArea();
    }

}
