package Practica1_4;

public class Herbs extends Plant{
    int age;
    boolean flower;
    boolean spices;
    boolean solid;

    public boolean isFlower() {
        return this.flower;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isSpices() {
        return this.spices;
    }

    public boolean isSolid() {
        return this.solid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public void setSpices(boolean spices) {
        this.spices = spices;
    }
    public String toString(){
        return "Herbs { age = "+this.getAge()+" flower = "+this.isFlower()+" spices = "+this.isSpices()+" solid = "+this.isSolid()+" }";
    }
}
