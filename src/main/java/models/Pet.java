package models;

public class Pet {

    public Pet() {}

    public String name;
    public Integer age;

    @Override
    public String toString() {
        return String.format("Name: %s - Age: %d", name, age);
    }

}