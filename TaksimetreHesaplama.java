import java.util.Scanner;

public class TaksimetreHesaplama{
    public static void main(String[] args) {

       double perKm = 2.20, basTutar = 10, toplam;

       Scanner input = new Scanner(System.in);
       System.out.println("Gidilen km: ");
       int km = input.nextInt();

       toplam = (km * perKm) + basTutar; 

       toplam = (toplam < 20) ? 20 : toplam;

       System.out.println("Toplam tutar = " + toplam);
    }
}