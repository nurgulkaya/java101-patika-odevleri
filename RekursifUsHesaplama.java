import java.util.Scanner;

public class RekursifUsHesaplama {

    public static int exponent(int base, int exp){
        if(exp==0){
            return 1;
        }else if(base==0){
            System.out.println("Yanlış değer girdiniz!");
        }
        return base * exponent(base, exp-1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int base = inp.nextInt();
        System.out.print("Üs giriniz: ");
        int exp = inp.nextInt();
        System.out.println("Sonuç: " + exponent(base, exp));
    }
}
