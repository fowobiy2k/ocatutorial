package org.example.collection.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        TreeMap<Car, String> myMap = new TreeMap<>();
        myMap.put(new Car("slim", 1925), "sold 1");
        myMap.put(new Car("eod", 1917), "sold 2");
        myMap.put(new Car("jetski", 1919), "sold 3");

        System.out.println(myMap);
        System.out.println(myMap.get(new Car("eod", 1917)));
    }

    public static class Car implements Comparable{
        private String model;
        private int year;

        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public int compareTo(Object o) {
            Car c = (Car) o;
            return getYear() - c.getYear();
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}
