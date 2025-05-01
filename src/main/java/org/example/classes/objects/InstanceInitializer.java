package org.example.classes.objects;

public class InstanceInitializer {
    String message;
    float radius = 12.4F;
    int data = 0xaa;

    InstanceInitializer() {
        System.out.println("Hello from constructor");
    }

    {
        System.out.println("Hello from instance initializer block");
        message = "Salut les amis " + Float.MAX_VALUE;
    }

    public static void main(String[] args) {
        InstanceInitializer i = new InstanceInitializer();
        System.out.println("Message is: " + i.message);
        System.out.println("Radius is: " + i.radius);
        System.out.println("Data is: " + i.data);
    }
}
