package org.example.functions;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = x -> x.length();
        Function<Integer, Integer> f2 = x -> x + 100;

        System.out.println(f1.andThen(f2).apply("hello world"));

        BinaryOperator<String> f3 = (a, b) -> a.concat(b);
        BiFunction<Integer, Double, String> f4 = (a, b) -> String.valueOf(a + b);

//        f4.andThen(f3).apply(2, 4);

        Predicate<Integer> p = a -> a > 2;
        Predicate<Integer> p2 = a -> a != 5;
        List<Integer> r = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        r.stream().filter(p.and(p2)).forEach(System.out::println);

        int[] arr = {1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
        stream.map(w -> ++w).forEach(System.out::println);

        List<Integer> a = Arrays.asList(1,2,3,4,5).stream().peek(System.out::println)
                .map(x -> x * x)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(a);

//        DoubleStream.iterate(-10, d -> d + 2).limit(20).collect(Collectors.toCollection(TreeSet::new));

        Map<Integer, String> m = new TreeMap<>();
        m.put(1, "a");
        m.put(2, "b");
        m.put(2, "c");
        m.put(3, "d");

        Set<Map.Entry<Integer, String>> entries = m.entrySet();

        Map<Integer, String> filteredMap = new TreeMap<>();
        entries.stream().forEach(x -> filteredMap.put(x.getKey(), x.getValue()));
        System.out.println(filteredMap);

        m.forEach((x, y) -> System.out.println(x + " <-> " + y));
        System.out.println(m);
    }
}
