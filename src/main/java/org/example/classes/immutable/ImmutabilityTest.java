package org.example.classes.immutable;

public class ImmutabilityTest {
    public static void main(String[] args) {
        Immutability i = new Immutability();

        System.out.println(i.getCards());

        i.getCards().add(new Card("spade", "orange"));
        i.getMyCard().setColor("magenta");
        System.out.println(i.getCards());
        System.out.println(i.getMyCard());

        i.printCardTree();
    }
}
