package Practica1_4;

public class Plant {
    private double size;
    private String color;
    private boolean haveFruits;
    private boolean isBlooming;
    public double getSize(){
        return this.size;
    }

    public boolean isBlooming() {
        return isBlooming;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaveFruits() {
        return haveFruits;
    }

    public void setBlooming(boolean blooming) {
        isBlooming = blooming;
    }

    public void setHaveFruits(boolean haveFruits) {
        this.haveFruits = haveFruits;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public String toString(){
        return"Plant { size = "+this.getSize()+" color = "+ this.getColor()+" haveFruits = "+this.isHaveFruits()+" isBlooming = "+this.isBlooming()+" }";
}
    public static void main(String[] args){
    System.out.println("Praactical №1.2. Variant 4. Matolygin Z.I. Group RIBO-03-21 ");
}

}
