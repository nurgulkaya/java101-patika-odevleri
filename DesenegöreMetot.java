import java.util.Scanner;

public class DesenegöreMetot{
    public static void patternMethod(int n){
        System.out.print(n + " ");
        if (n<=0){
            return;
        }
        patternMethod(n-5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        patternMethod(n);
        
    }

}