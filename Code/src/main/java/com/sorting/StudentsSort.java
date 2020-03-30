package com.sorting;

import java.util.Arrays;
import java.util.List;

public class StudentsSort {
    private static class Student implements Comparable<Student>{
        private final String name;
        private final int year;
        Student(String name, int year) {
            this.name = name;
            this.year = year;
        }

        @Override
        public int compareTo(Student o) {
            // sort by year
	    // try sort it by name ?
            int result = Integer.compare(year, o.year); // its advised against using subtraction to compare integers to avoid overflow bugs
            boolean check = name.equals(o.name);
            if(result != 0){ // 2 students in the same year
                return result;
            }
            return name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "Student{ "  +
                    " name = '" + name + '\'' +
                    ", year = " + year +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Onke", 2),
                new Student("Zolisa", 4),
                new Student("Athi", 1),
                new Student("Ndumiso", 9)
        );

        students.sort(null);
        System.out.println(students);
       // System.out.println(ThreadLocalRandom.current().ints(10).boxed().collect(Collectors.toList()));  // fill a list with 10 random numbers and print out
    }
}
