package Practica1_12_2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Plant implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String type;
    private String color;
    private int age;
    private boolean isAlive;

    public Plant() {}

    public Plant(String name, String type, String color, int age, boolean isAlive) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
        this.isAlive = isAlive;
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        type = (String) in.readObject();
        color = (String) in.readObject();
        age = in.readInt();
        isAlive = in.readBoolean();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(type);
        out.writeObject(color);
        out.writeInt(age);
        out.writeBoolean(isAlive);
    }

    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nColor: " + color + "\nAge: " + age + "\nIs alive: " + isAlive;
    }
}

