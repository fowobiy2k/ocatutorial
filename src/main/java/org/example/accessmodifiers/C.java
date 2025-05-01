package org.example.accessmodifiers;

public class C extends B implements D {

    public void doIt() {
        C c = new C();
        System.out.println(c.doSomething());
    }

    @Override
    void doAbstraction() {
        System.out.println("Abstract method executed");
    }

    @Override
    public void aMethod() {
        System.out.println("A method was executed");
    }
}
