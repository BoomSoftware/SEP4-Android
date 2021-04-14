package com.example.sep4_android.models;

public class User {
    private String name;
    private String sex;
    private int age;
    private boolean isOwner;

    public User(String name, String sex, int age, boolean isOwner) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.isOwner = isOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}
