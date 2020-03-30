package com.searching;

import java.util.*;
import java.util.stream.Stream;

public class Sets {
    public static void main( String[] args ) {

        List<Integer> even = Arrays.asList(2,4,8,10);
        int i =1;

        List<Integer> odd = Arrays.asList(1,9,11,13,3);
        List<Integer> prime = Arrays.asList(2,3,7,11,29, 13);
        System.out.println("OR");

        // How can we fnd the union ?
        List<Integer> unionEvenOdd = new ArrayList<>(even);
        unionEvenOdd.addAll(odd);
        System.out.println(unionEvenOdd);

        System.out.println("AND");
        // How can we find the intersection AND
        List<Integer> inters = new ArrayList<>(odd);
        inters.retainAll(prime);
        System.out.println(inters);
        // Set Difference
         //[3,5,8,0] - [5,8] = [3,0]
        System.out.println("Set Difference");
        List<Integer> setDiff = new ArrayList<>(prime);
        setDiff.removeAll(odd);
        System.out.println(setDiff);

        System.out.println("==================================");
        even.forEach(System.out::println);

    }
}
