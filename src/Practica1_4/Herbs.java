package Practica1_4;

public class Herbs extends Plant {
    int age;
    boolean flower;
    boolean spices;
    boolean spikes;

    public boolean isSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }

    public boolean isFlower() {
        return this.flower;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isSpices() {
        return this.spices;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }

    public void setSpices(boolean spices) {
        this.spices = spices;
    }

    public String toString() {
        return "Herbs { size = "+this.getSize()+" color = "+this.getColor()+" haveFruits = "+this.isHaveFruits()+
                " isBlooming = "+this.isBlooming()+"age = "+this.getAge()+" flower = "+this.isFlower()+
                " spices = "+this.isSpices()+" spikes = "+isSpikes()+" }";

    }
}
