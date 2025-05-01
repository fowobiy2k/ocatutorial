package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bayo", "lanre", "moses", "fasanya", "bekun");

        //List.forEach()
        System.out.println("using list");
        names.forEach(name -> System.out.println(name.toUpperCase()));

        System.out.println("using stream");
        names.stream().forEach(name -> System.out.println(name.toUpperCase()));
        System.out.println(names);

        List<Integer> ages = Arrays.asList(1, 14, 19, 8, 15, 9, 7, 16, 20);
        ages.forEach(ForEach::increment);
        System.out.println(ages);

        ages.stream().forEach(ForEach::increment);
        System.out.println(ages);
    }

    public static int increment(int x) {
        return x++;
    }
}
