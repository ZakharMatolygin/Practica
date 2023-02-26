package Practica1_4;

public class Rose extends Herbs{
    private String aroma;
    private String budShape;
    private int numberOfSpecies;

    public Rose(){
        this.setSize(35);
        this.setColor("Красный и зелёный");
        this.setHaveFruits(true);
        this.setBlooming(true);
        this.setAge(7);
        this.setFlower(true);
        this.setSpices(false);
        this.setSpikes(true);
        this.setAroma("Обладает ярко выраженным сладковатым запахом ");
        this.setBudShape("Бокаловидная форма");
        this.setNumberOfSpecies(500);

    }

    public String getAroma() {
        return aroma;
    }

    public int getNumberOfSpecies() {
        return numberOfSpecies;
    }

    public String getBudShape() {
        return budShape;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setBudShape(String budShape) {
        this.budShape = budShape;
    }

    public void setNumberOfSpecies(int numberOfSpecies) {
        this.numberOfSpecies = numberOfSpecies;
    }
    public String toString(){
        return "Rose { size = "+this.getSize()+", color = "+this.getColor()+", haveFruits = "+this.isHaveFruits()+
                ", isBlooming = "+this.isBlooming()+", age = "+this.getAge()+", flower = "+this.isFlower()+
                ", spices = " +this.isSpices()+", spikes = "+isSpikes()+", aroma = "+this.getAroma()+
                ", budShape = " +this.getBudShape()+", numberOfSpecies = "+this.getNumberOfSpecies()+" }";
    }

}
