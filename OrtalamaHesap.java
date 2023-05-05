import java.util.Scanner;
public class OrtalamaHesap {
    public static void main(String[] args) {

        int toplam, ortalama;
        double sonuc = 0;
        int mat, fizik, kimya, turkce, muzik, tarih;
        Scanner not = new Scanner (System.in);

        System.out.print("Matematik notunuz : ");
        mat = not.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = not.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = not.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = not.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = not.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = not.nextInt();

        toplam = (mat+fizik+kimya+turkce+muzik+tarih);
        sonuc = toplam/6;

        System.out.println("Ortalamanız :"+ sonuc);

        if(sonuc < 50){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
    
    }
}
