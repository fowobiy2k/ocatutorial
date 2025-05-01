package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())  // Flattening step
                .collect(Collectors.toList());
//Prints [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Flattened list: " + flattenedList);
    }
}
