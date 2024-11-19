package src.main.java.core.module_10;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;

    public User(String name, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{id: " + id + "; name: " + name + "; age: " + age + "}";
    }
}
