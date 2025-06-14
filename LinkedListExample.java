package com.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.addFirst("Kolkata");
        cities.addLast("Chennai");

        System.out.println("First city: " + cities.getFirst());
        
        System.out.println("All cities:");
        
        for (String city : cities) {
            System.out.println(city);
        }

        cities.remove("Mumbai");
        cities.removeFirst();

        System.out.println("After removal: " + cities);
    }
}

