package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AboutArrays {

    public static void main(String[] args) {
        String colors[] = {"blue", "orange"};
        String arrayCopy[] = colors.clone();
        String size = "small";

        for(String a : arrayCopy) {
            System.out.println(a);
        }

        System.out.println(Arrays.toString(colors));

        List<String> list = Arrays.asList(colors);
        System.out.println(list);

        System.out.println(Arrays.deepToString(colors));
        changeIt(size);
        System.out.println(size);

        ArrayList<String> as = new ArrayList<>(Arrays.asList("a", "b", "c"));
    }

    public static void changeIt(String param) {
        param = new String("large");
    }
}

class A {
    String gender;
    int age;

    A(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }
}