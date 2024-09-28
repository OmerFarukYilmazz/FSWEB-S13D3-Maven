package org.example;

public class Person {
    String firstName,lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] hobbies) {
        this(firstName,lastName,age); // constructor chaining.
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age <=19;
    }
}
