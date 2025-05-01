package org.example.classes.inner;

public class LocalInnerDemo {
    private static String msg = "Hello from LocalInnerDemo";

    public static void main(String[] args) {
        doSomething();
    }

    static void doSomething() {
        String color = "burgundi";

        class MyInnerClass {
            String firstname = "Powell";

            void doAnotherThing() {
                System.out.println("Firstname is: " + firstname);
                System.out.println("color is: " + color);
            }
        }

        MyInnerClass myInnerClass = new MyInnerClass();
        myInnerClass.doAnotherThing();
    }

    public static class AnotherClass{
        void doSomething() {
            System.out.println("Hello from AnotherClass");
            System.out.println("The private message is: " + msg);

        }
    }
}
