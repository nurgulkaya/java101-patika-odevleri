import java.util.Scanner;

public class FaktoriyelKombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, x, totalN=1, totalR=1, totalX=1;
        int result = 0;

        System.out.print("n değerini giriniz: ");
        n = inp.nextInt();
        System.out.print("r değeri giriniz: ");
        r = inp.nextInt();

        for(int i=1; i<=n; i++){
            totalN = totalN*i;
        }
        for(int i=1; i<=r; i++){
            totalR = totalR*i;
        } 
        
        x = n-r;
        for(int i=1; i<=x; i++){
            totalX = totalX*i;
        }

        result = totalN / (totalR*totalX);
        System.out.println("Kombinasyon: " + result);
    }
}
