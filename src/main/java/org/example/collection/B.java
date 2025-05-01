package org.example.collection;

public class B extends A{

    private String hobby;

    public B(String firstname, String lastname, int age, String hobby) {
        super(firstname, lastname, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
