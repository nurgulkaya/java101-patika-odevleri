import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz: ");
        int num = input.nextInt();
        int[] dizi = new int[num];

        System.out.println("Dizinin Elemanlarını Giriniz: ");
        for(int i=0; i<num;i++){
            System.out.print((i+1) + ". Elemanı: ");
            dizi[i] = input.nextInt();
        }

        Arrays.sort(dizi);
        System.out.print("Sıralama: ");
        for (int i=0;i<num; i++) {
            System.out.print(dizi[i] + " ");
        } 
    }
}
