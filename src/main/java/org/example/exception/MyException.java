package org.example.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException {

    public static void main(String[] args) throws TestException {
//        doSomething();
        BufferedReader reader;
        InputStreamReader inputStreamReader;

        try {
            inputStreamReader = new InputStreamReader(System.in);
            reader = new BufferedReader(inputStreamReader);

            System.out.println("Enter a value");
            String s = reader.readLine();

            System.out.println("You entered: " + s);
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomething() throws TestException {
        FileReader reader;

        try {
            reader = new FileReader("myFile.txt");
        } catch (Exception e) {
            throw new TestException(e.getMessage());
        }
    }
}

class TestException extends Exception {
    TestException(String message) {
        super(message);
    }

    TestException(Throwable cause) {
        super(cause);
    }
}
