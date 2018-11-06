package com.javaSe.reflection.shabaniExe.model;

public class UserReflect {
    private int id;
    private String name;

    public UserReflect() {
    }

    public UserReflect(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserReflect{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
