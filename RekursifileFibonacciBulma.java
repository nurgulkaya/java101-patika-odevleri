import java.util.Scanner;

public class RekursifileFibonacciBulma {

        static int fibonacci(int number){

            if (number==1 || number==2){
                return 1;
            }
            return fibonacci(number-1)+fibonacci(number-2);
        }
    
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int number = inp.nextInt();
            for(int i=1; i<=number;i++){
              System.out.print(fibonacci(i) + " ");
            }
        }
    }

