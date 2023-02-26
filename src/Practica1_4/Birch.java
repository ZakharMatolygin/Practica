package Practica1_4;

   public class Birch extends Tree{
   private String relationToLight;
   private String relationToTemperature;
   private String relationToMoisture;

    public Birch(){
        this.setSize(35);
        this.setColor("Зелёный и белый ");
        this.setHaveFruits(false);
        this.setBlooming(true);
        this.setKindOfLeaves("Лист плоский ");
        this.setDiameter(0.06);
        this.setDensity(800);
        this.setRelationToLight("Cветолюбива ");
        this.setRelationToTemperature("Морозостойка ");
        this.setRelationToMoisture("Засухоустойчива");

    }

    public String getRelationToLight() {
        return relationToLight;
    }

    public String getRelationToMoisture() {
        return relationToMoisture;
    }

    public String getRelationToTemperature() {
        return relationToTemperature;
    }

    public void setRelationToLight(String relationToLight) {
        this.relationToLight = relationToLight;
    }

    public void setRelationToMoisture(String relationToMoisture) {
        this.relationToMoisture = relationToMoisture;
    }

    public void setRelationToTemperature(String relationToTemperature) {
        this.relationToTemperature = relationToTemperature;
    }
    public String toString(){
        return "Birch { size = "+this.getSize()+", color = "+ this.getColor()+", haveFruits = "+this.isHaveFruits()+
                ", isBlooming = "+this.isBlooming()+", kindOfLeaves = "+this.getKindOfLeaves()+
                ", diameter = "+this.getDiameter()+", density = "+this.getDensity()+
                ", relationToLight = "+this.getRelationToLight()+", relationToTemperature = "+this.getRelationToTemperature()+
                ", relationToMoisture = "+this.getRelationToMoisture()+" }";
    }
}
