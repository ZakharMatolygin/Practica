package Practica1_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileUtils {
    public static boolean checkWorkDirectory(String path) {
        File workdir = new File(path);
        if (workdir.exists()) {
            return true;
        } else {
            return workdir.mkdir();
        }
    }

    public static void writeFileNames(String dirName,String r,ArrayList<String> files) throws IOException {
        File dir = new File(dirName);
        if(dir.getName().endsWith(r)) {
            files.add(dir.getPath()+dir.getName() + " " + dir.length());
        }
        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    writeFileNames(name.getPath(),r,files);
        }
    }

    public static void writeStringToFile(String path, String str) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(str);
        fw.close();
    }

    public static byte[] readBytesFromFile(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();

            return data;
        } else {

            return new byte[]{};

        }
    }
    public static void main(String[] args) {
        System.out.println(" (Practical №1.10) Variant 4. Group RIBO-03-21. Matolygin Z.I. ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь: ");
        String path = in.nextLine();
        System.out.println("Введите расширение: ");
        String r = in.nextLine();
        ArrayList<String> files = new ArrayList<>();

        boolean isExistWorkDir = FileUtils.checkWorkDirectory(path);

        if(isExistWorkDir){
            try{
                FileUtils.writeFileNames(path,r,files);
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Finding "+r+" in "+path);
            Collections.sort(files);
            for (String s :files ){
                System.out.println(s);
            }
        }
    }
}