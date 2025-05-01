package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AboutStreams {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> l = list.stream().filter(i -> i > 1).collect(Collectors.toList());
        System.out.println(l);

        list.add(1, 23);
        System.out.println(list);

        int[] myArray = {6, 7, 8, 9};
        myArray[1] = 50;

        for (int x : myArray) {
            System.out.println(x + "\t");
        }

        System.out.println();

        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .filter(a -> a > 0)
                .map(a -> a * a)
                .forEach(AboutStreams::multiply);

    }

    public static void multiply(int x) {
        System.out.println(x * 2);
    }
}


