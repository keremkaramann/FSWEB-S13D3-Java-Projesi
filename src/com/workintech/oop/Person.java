package com.workintech.oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    int weight;
    int height;
    String hairColor;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int weight, int height) {
        this(firstName, lastName, age);
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, String lastName, int age, int weight, int height, String hairColor) {
        this(firstName, lastName, age, weight, height);
        this.hairColor = hairColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
      return age>=13 && age <=19;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
