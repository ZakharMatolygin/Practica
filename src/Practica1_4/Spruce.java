package Practica1_4;

public class Spruce extends Tree{
    private boolean cones;
    private int lifeLength;
    public String reproduction;

    public Spruce(){
        this.setSize(30);
        this.setColor("Зелёный и коричневый ");
        this.setHaveFruits(false);
        this.setBlooming(false);
        this.setKindOfLeaves("Иголки ");
        this.setDiameter(0.15);
        this.setDensity(470);
        this.setCones(true);
        this.setLifeLength(300);
        this.setReproduction("С помощью семян в шишках ");

    }

    public boolean isCones() {
        return cones;
    }

    public int getLifeLength() {
        return lifeLength;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setCones(boolean cones) {
        this.cones = cones;
    }

    public void setLifeLength(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
    public String toString(){
        return "Spruce { size = "+this.getSize()+", color = "+ this.getColor()+", haveFruits = "+this.isHaveFruits()+
                ", isBlooming = "+this.isBlooming()+", kindOfLeaves = "+this.getKindOfLeaves()+
                ", diameter = "+this.getDiameter()+", density = "+this.getDensity()+", cones = "+this.isCones()+
                ", lifeLength = "+this.getLifeLength()+", reproduction = "+this.getReproduction()+" }";
    }
}
