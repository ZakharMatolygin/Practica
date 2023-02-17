import java.util.Scanner;

public class Practica1_2{
    public static void main(String[] args) {
        System.out.println("Praactical №1.2. Variant 4. Matolygin Z.I. Group RIBO-03-21 ");
        System.out.println("Введите количество месяцев: ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println("Введите месяцный процент по вкладу: ");
        double p = in.nextDouble();
        System.out.println("Введите начальную сумму: ");
        double s= in.nextDouble();
        int i= 1;
        double t=0;
        while (i<= m){
            double e= s*p/100;
            s=s+e;
            System.out.println("Доход в "+i+" мясяц "+e);
            t= t+e;
            i++;

        }
        System.out.println("Итоговый доход: "+t);
    }
}
