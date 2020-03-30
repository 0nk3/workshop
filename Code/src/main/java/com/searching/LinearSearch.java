package com.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/* ****************************************** *
 * @author : Ndumiso Onke Fanti               *
 * ****************************************** */
public class LinearSearch {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> mylist = Arrays.asList(1,4,7,-9, 100);
        ThreadLocalRandom.current().ints(10_000_000).forEach(list::add);
        list.addAll(mylist);

        Collections.shuffle(list);
        long startTime = System.currentTimeMillis();
        System.out.println(linearSearch(list,-9 ));
        System.out.println("Time take : " + (System.currentTimeMillis() -startTime));

    }
    private static boolean linearSearch( List<Integer> list, int toFind){
        boolean isFound = false;
        for(int number : list){
            if(number == toFind){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
