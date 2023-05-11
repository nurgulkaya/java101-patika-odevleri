import java.util.Scanner;

public class EnBuyukveEnKucukSayiBulma {
    public static void main(String[] args) {

        int num, number;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        num = input.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
        
            if(number>max){
                max = number;
            }else if(number<min){
                min = number;
            }else{
                System.out.println("Hatalı girdi!");
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
       

    }
}
