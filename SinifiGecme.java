import java.util.Scanner;
public class SinifiGecme {
    public static void main(String[] args) {

        int toplam = 0;
        double sonuc = 0;
        int mat, fizik, kimya, turkce, muzik;
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

        if(mat>=0 && mat<=100){
            toplam+=mat;
        }

        if(fizik>=0 && fizik<=100){
            toplam += fizik;
        }

        if(kimya>=0 && kimya<=100){
            toplam += kimya;
        }

        if(turkce>=0 && turkce<=100){
            toplam += turkce;
        }

        if(muzik>=0 && muzik<=100){
            toplam += muzik;
        }
        sonuc = toplam/5;

        if(sonuc <= 55){
           System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
        System.out.println("Ortalamanız :"+ sonuc);
    }
}
