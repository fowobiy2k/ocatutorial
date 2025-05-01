package org.example.classes.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public final class Immutability {
    private final int deckCount;
    private final List<Card> cards;
    private final Card myCard;

    {
        deckCount = 5;
        List<Card> lc = new ArrayList(){{
            add(new Card("diamond", "black"));
            add(new Card("heart", "red"));
            add(new Card("spade", "black"));
            add(new Card("tree", "red"));
            add(new Card("diamond", "red"));
        }};

        cards = lc;

        myCard = new Card("tree", "blue");
    }

    public int getDeckCount() {
        return deckCount;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getMyCard() {
        return myCard;
    }

    public void printCardTree() {
        TreeSet<Card> cardTree = new TreeSet<>();
        cardTree.add(new Card("rhombus", "pink"));
        cardTree.add(new Card("triangle", "beige"));
        cardTree.add(new Card("trapezium", "blue"));
        cardTree.add(new Card("kite", "yellow"));
        cardTree.add(new Card("square", "pale"));

        System.out.println(cardTree.first());
        System.out.println(cardTree.last());
    }
}

class Card {
    String shape, color;

    public Card(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}