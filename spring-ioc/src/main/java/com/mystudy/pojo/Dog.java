package com.mystudy.pojo;

public class Dog {
    private String name;
    private String type;
    private String color;

    private Person master;
    public Dog() {
    }

    public Dog(String name, String type, String color, Person master) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", master=" + master +
                '}';
    }
}
