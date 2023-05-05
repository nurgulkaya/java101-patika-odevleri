import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        
        sonuc = kilo / (Math.pow(boy,2));
        System.out.println("Vücut Kitle İndeksiniz: " + sonuc);
    }
}
