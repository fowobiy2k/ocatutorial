package org.example.classes.pass;

public class ByValue {

    public static void main(String[] args) {
        Bottle b = new Bottle("small", "purple");
        System.out.println("Initial size is: " + b.getSize());

        changeIt(b);

        System.out.println("Final size is: " + b.getSize());
    }
    private static void changeIt(Bottle bottle) {
        bottle = new Bottle("large", "red");
    }
}

class Bottle {
    private String size;
    private String color;

    Bottle(String size, String color) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}