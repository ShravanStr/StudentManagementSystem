import java.util.ArrayList;
import java.util.Scanner;

abstract class Person {
    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}