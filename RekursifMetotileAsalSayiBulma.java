import java.util.Scanner;

public class RekursifMetotileAsalSayiBulma {
        public static int primeNumber(int number){
            int result = 0;
            for(int i = 2; i<number; i++) {
                if(number % i==0) {
                    result++;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();
    
            if(primeNumber(number) == 0) {
                System.out.println("Asal Sayıdır.");
            }else{
                System.out.println("Asal Sayı değildir.");
            }
        }
}
    

