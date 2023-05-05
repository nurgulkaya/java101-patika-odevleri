import java.util.Scanner;

public class DikUcgeninHipotenusu {
    public static void main(String[] args) {

        int a, b;
        double hipotenus, alan;
        
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarın uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci kenarın uzunluğunu giriniz: ");
        b = input.nextInt();

        hipotenus = Math.sqrt((a * a) + (b * b));
        alan = (a*b)/2;

        System.out.println("Hipotenüs: " + hipotenus);
        System.out.println("Üçgenin alanı = " + alan);
    }
}

