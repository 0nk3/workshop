package com.searching;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/* ****************************************** *
 * @author : Ndumiso Onke Fanti               *
 * ****************************************** */
public class binSearch {
    //      [1,4,7,9,11] lets say we want to find 9
    // List has to be sorted! --> disadvantage
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        ThreadLocalRandom.current().ints(10).forEach(list::add);
        List<Integer> myList = Arrays.asList(3,14,0 -9, 29);
        list.addAll(myList);
        list.sort(null);

        //System.out.println(list);
        System.out.println("Start");
        long start = System.currentTimeMillis();
        System.out.println(binarySearch(list, 29) ? "Found": " Not Found");
        System.out.println(" Time take  " + (System.currentTimeMillis() - start));

        List<String> strings = Arrays.asList("Tumi", "Shirley", "Steve", "Sheena");
        strings.sort(null);
        System.out.println(strings);



    }
    private static boolean binarySearch( List<Integer> list, int searchValue){
        int start = 0;
        int end = list.size() -1;
        while(start < end){
            int mid = (start + end)/2;
            //System.out.println("Mid = " + mid);
            if(list.get(mid) == searchValue){
                return true;
            }else if(list.get(mid) < searchValue){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return false;
    }

}