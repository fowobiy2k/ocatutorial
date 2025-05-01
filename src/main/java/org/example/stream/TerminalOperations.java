package org.example.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<String> movies = Arrays.asList("the god father", "serendipity", "sleepless in seatle", "pearl harbour", "count of monte cristo");
        long count = movies.stream().filter(title -> title.contains("god")).count();
        System.out.println(count + " items contain god");

        List<String> firstThreeMovies = movies.stream().limit(3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("The first three movies are: " + firstThreeMovies);

        String reduce = movies.stream().filter(title -> title.contains(" ")).map(title -> title.concat("<>")).map(title -> title.replace(" ", "*")).reduce("", (a, b) -> a + b);
        System.out.println("The reduced list: " + reduce);
    }
}
