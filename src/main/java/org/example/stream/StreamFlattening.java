package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFlattening {

    public static void main(String[] args) {
        List<Parent> parents = new ArrayList<>();
        parents.add(new Parent("simpsons", new ArrayList<String>(){{
            add("ojay");
            add("benita");
            add("lagbaja");
        }}));
        parents.add(new Parent("jones", new ArrayList<String>(){{
            add("lambda");
            add("mushua");
            add("larry");
        }}));

        parents.stream()
                .filter(Parent::filter)
                .flatMap(a -> a.getChildren().stream())
                .forEach(System.out::println);

        parents.forEach(a -> System.out.println(a.lastname));
    }

    static class Parent {
        private String lastname;
        private List<String> children;

        public Parent(String lastname, List<String> children) {
            this.lastname = lastname;
            this.children = children;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public List<String> getChildren() {
            return children;
        }

        public void setChildren(List<String> children) {
            this.children = children;
        }

        public static boolean filter(Parent p) {
            return p.getLastname().length() < 6;
        }
    }
}
