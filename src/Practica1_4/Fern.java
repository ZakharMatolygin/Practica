package Practica1_4;

public class Fern extends Herbs{
    private String reproduction;
    private int numberOfStems;
    private String relationToTheSoil;

    public Fern(){
        this.setSize(35);
        this.setColor("Зелёный");
        this.setHaveFruits(false);
        this.setBlooming(false);
        this.setAge(100);
        this.setFlower(false);
        this.setSpices(false);
        this.setSpikes(false);
        this.setReproduction("С помощью спор ");
        this.setNumberOfStems(25);
        this.setRelationToTheSoil("Не требовательный");

    }

    public String getReproduction() { return reproduction; }

    public int getNumberOfStems() { return numberOfStems; }

    public String getRelationToTheSoil() { return relationToTheSoil; }

    public void setReproduction(String reproduction) { this.reproduction = reproduction; }

    public void setNumberOfStems(int numberOfStems) { this.numberOfStems = numberOfStems; }

    public void setRelationToTheSoil(String relationToTheSoil) { this.relationToTheSoil = relationToTheSoil; }
    public String toString(){
        return "Fern { size = "+this.getSize()+", color = "+this.getColor()+", haveFruits = "+this.isHaveFruits()+
                ", isBlooming = "+this.isBlooming()+ ", age = "+this.getAge()+", flower = "+this.isFlower()+
                ", spices = "+this.isSpices()+", spikes = "+isSpikes()+", reproduction = "+this.getReproduction()+
                ", numberOfStems = "+this.getNumberOfStems()+", relationToTheSoil = "+this.getRelationToTheSoil()+" }";
    }
}
