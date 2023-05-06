import java.util.Scanner;

public class DordunKatiToplami {
    public static void main(String[] args) {

        int num, total=0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayi giriniz: ");
            num = inp.nextInt();
            if(num%4==0){
              total += num;
            }
        }while(num%2 != 1);
        
        System.out.println("Toplam: " + total);
}

        
    }

