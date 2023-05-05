import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a, b;
        float sonuc = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        b = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz nedir: ");

        int select = inp.nextInt();

        switch(select){
           case 1:
           sonuc = a+b;
           break;
           case 2:
           sonuc = a-b;
           break;
           case 3:
           sonuc = a*b;
           break;
           case 4:
             if(b != 0){
               sonuc = a/b;
             }else{
                System.out.println("Bir sayı 0'a bölünemez!");
             }
           break;
           default:
             System.out.println("Yanlış bir seçim yaptınız!");
             break;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
