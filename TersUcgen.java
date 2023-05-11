import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kaç basamak olacağına dair girdi alınır
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for(int i=n; i>=1; i--) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

