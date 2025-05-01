package org.example.accessmodifiers;

public final class A {
    String name = "A";

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.doSomething());
        c.doIt();
        c.color = "blue";
        System.out.println(c.color);
        D d = new C();
        testInterface((C)d);

    }

    public static void testInterface(C c) {
        System.out.println("Executing interface method");
        c.aMethod();
        Integer x = 2;
    }
}
