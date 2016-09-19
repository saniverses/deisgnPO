package ru.sbt;

/**
 * Created by user7 on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 21);
        person.sayHello();
        System.out.println(person.isAdult());
        
    }
}
