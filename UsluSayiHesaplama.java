import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int a, b, result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("Üssü giriniz: ");
        b = inp.nextInt();

        for(int i=1; i<=b; i++){
            result = result*a;
        }

        System.out.println("Cevap: " + result);


    }
}
