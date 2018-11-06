package com.javaSe.reflection.shabaniExe.model;

public class UserQ2 {
    private int id3;
    private String name3;

    public UserQ2() {
    }

    public UserQ2(int id3, String name3) {
        this.id3 = id3;
        this.name3 = name3;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    @Override
    public String toString() {
        return "UserQ2{" +
                "id3=" + id3 +
                ", name3='" + name3 + '\'' +
                '}';
    }
}
