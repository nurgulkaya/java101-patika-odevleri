import java.util.Scanner;

public class BasamakSayilariToplama {
    public static void main(String[] args) {
        int b, total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = inp.nextInt();

        while(a!=0){
            b = a % 10;
            total = total + b;
            a = a/10;
        }
        System.out.println("Sonuç: " + total);
    }
}
