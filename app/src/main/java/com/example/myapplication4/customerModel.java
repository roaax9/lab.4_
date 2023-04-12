package com.example.myapplication4;

public class customerModel {
    private int ID;
    private String name;
    private int age;
    private boolean isActive;

    public customerModel() {
    }

    public customerModel(int ID, String name, int age, boolean isActive) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "customerModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
