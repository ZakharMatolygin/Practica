package Practica1_4;

public class Tree extends Plant {
    private String kindOfLeaves;
    private double diameter;
    private double density;

    public String getKindOfLeaves(){
        return this.kindOfLeaves;
    }

    public double getDensity() {
        return this.density;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setKindOfLeaves(String kindOfLeaves) {
        this.kindOfLeaves = kindOfLeaves;
    }

    public String toString(){
        return "Tree { size = "+this.getSize()+" color = "+ this.getColor()+" haveFruits = "+this.isHaveFruits()+
                " isBlooming = "+this.isBlooming()+" kindOfLeaves = "+this.getKindOfLeaves()+
                " diameter = "+this.getDiameter()+" density = "+this.getDensity()+" }";
    }

}
