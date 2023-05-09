import java.util.Scanner;
public class YildizileElmasYapimi {
    public static void main(String[] args) {

        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        num = inp.nextInt();

        for (int i=0; i <=num; i++) {
            for (int j=0; j <(num-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=num; i>=0; i--) {
            for (int j=(num-i); j>0; j--) {
                System.out.print(" ");
            }
            for (int j=(2*i+1); j>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}