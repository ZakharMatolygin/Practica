import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Passport{
    ArrayList<Person> persons = new ArrayList<>();

    public void add(int number, String fullName, String position, boolean mark){
        for(int i = 0;i < persons.size(); i++){
            if(persons.get(i).getNumber() == number){
                persons.remove(i);
                persons.add(i, new Person(number,fullName,position,mark));
                return;
            }
        }
        persons.add(new Person(number,fullName,position,mark));
        Collections.sort(persons , new PersonComparatorByFullName());
        for (Person j:persons){
            System.out.println(j.toString());
        }
System.out.println("\n");
        Collections.sort(persons , new PersonComparatorByNumbers());
        for (Person j:persons){
            System.out.println(j.toString());
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        System.out.println(" (Practical №1.8) Variant 4. Group RIBO-03-21. Matolygin Z.I. ");
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество пропусков: ");
        int n = in.nextInt();
        Passport pass = new Passport();
        for(int i=0; i<n; i++){
            System.out.println("Введите номер пропуска: ");
            int number = in.nextInt();
            in.nextLine();
            System.out.println("Введите ФИО: ");
            String fullName = in.nextLine();
            System.out.println("Введите должность: ");
            String position = in.nextLine();
            System.out.println("Есть ли допуск на закрытую территорию: ");
            boolean mark = in.nextBoolean();
            pass.add(number,fullName,position,mark);
        }


    }
}
