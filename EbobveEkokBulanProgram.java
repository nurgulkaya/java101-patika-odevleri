import java.util.Scanner;
public class EbobveEkokBulanProgram {
    
    public static void main(String[] args) {

        int a, b, ebob=1, ekok=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci giriniz: ");
        b = inp.nextInt();


        int i = 1;
        while(i<=a && i<=b){
            if  (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (a*b)/ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    
    }
}