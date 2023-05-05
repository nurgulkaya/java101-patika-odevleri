import java.util.Scanner;
public class ortalamaHesap {
    public static void main(String[] args) {

        int toplam, ortalama;
        double sonuc = 0;
        int Mat, Fizik, Kimya, Turkce, Muzik, Tarih;
        Scanner not = new Scanner (System.in);

        System.out.print("Matematik notunuz : ");
        Mat = not.nextInt();

        System.out.print("Fizik notunuz : ");
        Fizik = not.nextInt();

        System.out.print("Kimya notunuz : ");
        Kimya = not.nextInt();

        System.out.print("Türkçe notunuz : ");
        Turkce = not.nextInt();

        System.out.print("Müzik notunuz : ");
        Muzik = not.nextInt();

        System.out.print("Tarih notunuz : ");
        Tarih = not.nextInt();

        toplam = (Mat+Fizik+Kimya+Turkce+Muzik+Tarih);
        sonuc = toplam/6.0;

        System.out.println("Ortalamanız :"+ sonuc);

        boolean kaldiniz = sonuc < 50;
        boolean gectiniz = sonuc >= 50;

        System.out.println("Kaldı mı? " + kaldiniz);
        System.out.println("Geçti mi? " +  gectiniz);
    }
}
