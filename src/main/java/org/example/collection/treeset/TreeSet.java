package org.example.collection.treeset;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> set1 = new java.util.TreeSet<>();
        Set<String> set2 = new java.util.TreeSet<>(Comparator.comparing(String::length));
        Set<String> set3 = Collections.synchronizedSet(set2);
        java.util.TreeSet<String> set4 = new java.util.TreeSet<>();

        boolean a = set1.add("a");
        System.out.println(a);
        set1.contains("a");


        set4.add("b");
        set4.add("c");
        set4.add("d");

        Iterator<String> itr = set4.descendingIterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        java.util.TreeSet<Integer> set5 = new java.util.TreeSet<>();
        set5.add(17);
        set5.add(32);
        set5.add(64);
        set5.add(5);
        set5.add(21);

        System.out.println(set5.first());
        System.out.println(set5.last());
    }
}
