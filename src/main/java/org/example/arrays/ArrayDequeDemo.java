package org.example.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> myStack = new ArrayDeque<>();
        myStack.push("hello");
        myStack.push("world");

        myStack.pop();
        System.out.println(myStack);

        List<String> list = new ArrayList<String>();
    }
}
