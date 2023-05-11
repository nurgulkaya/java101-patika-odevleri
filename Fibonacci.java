import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        int total;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz: ");
        int number = input.nextInt();

        System.out.print(num1 + " " + num2);
        for(int i=2; i<=number; i++) {
            total = num1 + num2;
            System.out.print(" " + total);
            num1 = num2;
            num2 = total;
        
        }
    }
}
