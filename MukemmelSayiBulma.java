import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for(int i=1; i<number; i++){
            if(number%i == 0){
                counter+=i;
            }
        }
        if(counter == number){
            System.out.println(number + " mükemmel sayıdır.");
        }else{
            System.out.println(number + " mükemmel sayı değildir.");
        }

    }
}
