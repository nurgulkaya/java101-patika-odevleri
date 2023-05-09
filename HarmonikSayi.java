import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int a;
        double result = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        a = inp.nextInt();

        for(double i=1; i<=a; i++){
           result += (1/i);
        }
        System.out.println(result);
}
}
