package org.example.collection;

public class A {
    private String firstname;
    private String lastname;
    private int age;

    public A(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "A{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
