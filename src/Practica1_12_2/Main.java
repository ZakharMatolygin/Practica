package Practica1_12_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" (Practical №1.14) Variant 4. Group RIBO-03-21. Matolygin Z.I. ");
            String filePath = "C:/Plant.obj";

            try {
                FileOutputStream fileOut = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter plant name: ");
                String name = scanner.nextLine();

                System.out.print("Enter plant type: ");
                String type = scanner.nextLine();

                System.out.print("Enter plant color: ");
                String color = scanner.nextLine();

                System.out.print("Enter plant age: ");
                int age = scanner.nextInt();

                System.out.print("Is the plant alive? (true/false): ");
                boolean isAlive = scanner.nextBoolean();

                Plant plant = new Plant(name, type, color, age, isAlive);
                out.writeObject(plant);

                out.close();
                fileOut.close();

                System.out.println("Plant object has been serialized and saved to " + filePath);

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

