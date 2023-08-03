import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz: ");
        int boyut = input.nextInt();

        int [] dizi = new int [boyut];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < boyut; i++){
            dizi[i] = input.nextInt();
        }

        double total = 0;
        for (int i = 0; i < boyut; i++) {
            total += 1.0 / dizi[i];
        }   
        
        double ortalama = boyut / total;
        System.out.println("Harmonik Ortalama: " + ortalama);

    }
  
}