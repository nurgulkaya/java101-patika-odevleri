import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5.00; 
        double kilo, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        kilo = inp.nextDouble();
        toplam += kilo*armut;

        System.out.print("Elma Kaç Kilo? : ");
        kilo = inp.nextDouble();
        toplam += kilo*elma;

        System.out.print("Domates Kaç Kilo? : ");
        kilo = inp.nextDouble();
        toplam += kilo*domates;

        System.out.print("Muz Kaç Kilo? : ");
        kilo = inp.nextDouble();
        toplam += kilo*muz;

        System.out.print("Patlıcan Kaç Kilo? : ");
        kilo = inp.nextDouble();
        toplam += kilo*patlican;

        System.out.print("Toplam tutar: " + toplam + " TL");

    }
}
