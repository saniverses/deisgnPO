package ru.sbt;

/**
 * Created by user7 on 05.09.2016.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public boolean isAdult () {
        //return (age > 18) ? true : false;
        return age > 18;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
