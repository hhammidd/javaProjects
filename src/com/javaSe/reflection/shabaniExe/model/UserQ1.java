package com.javaSe.reflection.shabaniExe.model;

public class UserQ1 {
    private int id;
    private String name;

    public UserQ1() {
    }

    public UserQ1(int id, String name) {
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
        return "UserQ1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
