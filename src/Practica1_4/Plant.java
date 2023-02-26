package Practica1_4;

import java.util.Scanner;

public class Plant {
    private double size;
    private String color;
    private boolean haveFruits;
    private boolean isBlooming;

    public double getSize() {
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

    public String toString() {
        return "Plant { size = "+this.getSize() + " color = "+this.getColor()+
                " haveFruits = "+this.isHaveFruits()+" isBlooming = "+this.isBlooming()+" }";
    }

    public static void main(String[] args) {
        System.out.println("Praactical №1.2. Variant 4. Matolygin Z.I. Group RIBO-03-21 ");
        System.out.println("           Plant               ");
        System.out.println("          /     \\             ");
        System.out.println("       1)Tree  2)Herbs         ");
        Scanner in = new Scanner(System.in);
        int scanner = in.nextInt();
        Plant plant = new Plant();
        if (scanner == 1) {
            System.out.println("           Plant           ");
            System.out.println("          /     \\         ");
            System.out.println("        Tree   Herbs       ");
            System.out.println("       /    \\             ");
            System.out.println("  1)Spruce  2)Birch        ");
            scanner = in.nextInt();
            if (scanner == 1) {
                plant = new Spruce();
            }

            if (scanner == 2) {
                plant = new Birch();
            }

        } else if (scanner == 2) {
            System.out.println("           Plant           ");
            System.out.println("          /     \\         ");
            System.out.println("        Tree   Herbs       ");
            System.out.println("              /     \\     ");
            System.out.println("           1)Fern  2)Rose  ");
            scanner = in.nextInt();

            if (scanner == 1) {
                plant = new Fern();
            }

            if (scanner == 2) {
                plant = new Rose();
            }

        }
        System.out.println(plant.toString());


    }
}
