import java.util.Scanner;

public class DaireAlanCevre{

    public static void main(String[] args) {
        
        double pi = 3.14;
        double alan, cevre, yaricap = 0;
        double aci, daireDilimAlani;

        Scanner input = new Scanner(System.in);
        System.out.println("Yariçap giriniz: ");
        yaricap = input.nextInt();
        aci = input.nextInt();

        alan = pi * Math.pow(yaricap, 2);
        cevre = 2*pi*yaricap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        daireDilimAlani = (pi * (Math.pow(yaricap, 2)*aci))/360;

        System.out.println("Daire Diliminin Alanı: " + daireDilimAlani);

    }
}