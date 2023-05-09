import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {

        int value;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        value = input.nextInt();

        System.out.println("Dördün kuvvetleri: ");
        for(int i=1; i<value; i*=4){
            System.out.println(i);
        }

        System.out.println("Beşin kuvvetleri: ");
        for(int i=1; i <value; i*=5){
            System.out.println(i);
        }
    }
}
