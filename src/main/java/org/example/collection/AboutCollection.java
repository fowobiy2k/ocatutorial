package org.example.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class AboutCollection implements Comparator {

    public static void main(String[] args) {
        List<A> aa = new ArrayList<A>(){{
            add(new A("john", "bosco", 29));
            add(new A("james", "olawale", 1));
            add(new A("olaniyan", "omoboriowo", 7));
            add(new B("olaniyan", "omoboriowo", 7, "shouting"));
        }};

        aa.forEach(System.out::println);

        Collections.sort(aa, (a,b) -> {
            if(a.getAge() < b.getAge()) return -1;
            if(a.getAge() > b.getAge()) return 1;
            return 0;
        });

        System.out.println(aa);

        List<B> passengers = new ArrayList<B>(){{
            add(new B("olaniyan", "omoboriowo", 7, "shouting"));
        }};

        A act = new B("olaniyan", "omoboriowo", 7, "shouting");

//        bus(passengers);

//        Collections.sort(aa, Collections.reverseOrder());

        Properties p = new Properties();
        p.setProperty("name", "big man");
        p.setProperty("city", "joburg");
        p.setProperty("color", "cyan");
        p.setProperty("height", "5ft");

        saveProperty(p);
    }

    public static void bus(List<A> al) {
        System.out.println("passengers onboard");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void saveProperty(Properties properties) {
        try {
            FileOutputStream outputStream = new FileOutputStream("props.properties");
            properties.store(outputStream, "first set");
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fetchProperties(Properties properties) {
        try {
            FileInputStream inputStream = new FileInputStream("props.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
