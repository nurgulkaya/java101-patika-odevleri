import java.util.Scanner;

public class BolunenSayiHesaplama {
    public static void main(String[] args) {

        int number, counter = 0;
        int result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for(int i=1; i<number; i++){
            if(i%3==0 && i%4==0){
                result += i;
                counter++;
            }
        }
        
        result = result/counter;
        System.out.println("Ortalama: " + result);
        
    }
}
