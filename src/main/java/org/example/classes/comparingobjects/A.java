package org.example.classes.comparingobjects;

public class A {

    public static void main(String[] args){
        String a = "a";
        String b = "b";
        String c = a;
        String d = "b";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(d == b);
        System.out.println(b.equals(d));
    }
}
