package Practica1_12;

import java.io.Serializable;
import java.util.Scanner;

public class Plant implements Serializable {
    private String name;
    private String specie;
    private int age;
    private int height;
    private int weight;

    public Plant(String name, String specie, int age, int height, int weight) {
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecie() {
        return specie;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        System.out.println(" (Practical №1.10) Variant 4. Group RIBO-03-21. Matolygin Z.I. ");
        Scanner scan = new Scanner(System.in);
        System.out.print("path = ");
        String jj = scan.nextLine();
        System.out.print("name = ");
        String aj = scan.nextLine();
        System.out.print("specie = ");
        String cj = scan.nextLine();
        System.out.print("age = ");
        int bj = scan.nextInt();
        System.out.print("height = ");
        int dj = scan.nextInt();
        System.out.print("weight = ");
        int ej = scan.nextInt();


        Plant myPlant = new Plant(aj, cj, bj, dj, ej);
        SaverRunnable sr = new SaverRunnable(myPlant, jj);
        System.out.print(jj + "\n");
        Thread th = new Thread(sr);
        th.start();
    }
}
