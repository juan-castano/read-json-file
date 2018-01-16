package models;

import java.util.List;

public class User {

    public User() {}

    public String name;
    public List<Pet> petList;

    @Override
    public String toString() {
        return String.format("User: %s - Pet list: %s", name, petList.toString());
    }

}