package Practica1_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaverRunnable implements Runnable {
    private Plant plant;
    private String path;

    public SaverRunnable(Plant plant, String path) {
        this.plant = plant;
        this.path = path;
    }

    @Override
    public void run(){
        if(this.path != null && plant != null) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(this.path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(plant);
                oos.close();
                System.out.println("Success serialezation obj Plant");
            } catch (IOException ex) {
                System.out.println("Error saving objact to path: " + this.path);

            }
        }
    }
}
