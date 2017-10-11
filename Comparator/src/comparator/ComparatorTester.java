/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import static comparator.Country.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author wezhou
 */
public class ComparatorTester {
    public static void main(String[] args)
   {
      ArrayList<Country> countries = new ArrayList<Country>();
      countries.add(new Country("Uruguay", 176220));
      countries.add(new Country("Thailand", 514000));
      countries.add(new Country("Belgium", 30510));

      System.out.println("Comparator by increasing area");
      Comparator<Country> compArea = createComparatorByArea(true);
      Collections.sort(countries, compArea);
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      
      System.out.println("\nComparator by decreasing area");
      Comparator<Country> compAreaF = createComparatorByArea(false);
      Collections.sort(countries, compAreaF);
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      
      System.out.println("\nComparator by alphabetical order");
      Comparator<Country> compName = createComparatorByName(false);
      Collections.sort(countries, compName);
      // Now the array list is sorted by name
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      
      System.out.println("\nComparator by reverse alphabetical order");
      Comparator<Country> compNameF = createComparatorByName(false);
      Collections.sort(countries, compNameF);
      // Now the array list is sorted by name
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
      
   }
}
