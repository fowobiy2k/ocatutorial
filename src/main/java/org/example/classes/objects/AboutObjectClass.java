package org.example.classes.objects;

public class AboutObjectClass {
    public static void main(String[] args) {
        Object obj = new Object();
        String s1 = "bread";
        String s2 = "breads";

        System.out.println(obj.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
