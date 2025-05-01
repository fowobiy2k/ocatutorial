package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("purple", "red", "indigo", "turquoise", "magenta");
        Optional<String> any = colors.stream().findAny();
        String color1 = any.isPresent() ? any.get() : null;
        System.out.println(color1);

        Optional<String> first = colors.stream().findFirst();
        System.out.println(first.get());

        boolean b = colors.stream().anyMatch(a -> a.length() > 6);
        System.out.println(b);
    }
}
