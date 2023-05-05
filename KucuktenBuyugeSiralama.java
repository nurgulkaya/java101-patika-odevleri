import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        a = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        b = inp.nextInt();

        System.out.print("3. Sayıyı Giriniz : ");
        c = inp.nextInt();

        if ((a < b) && (a < c)){
            if (b < c){
                System.out.print(a + "<" + b + "<" + c);
            }else{
                System.out.println(a + "<" + c + "<" + b);
            }
        }
        else if((b < a) && (b < c)){
            if (a < c){
                System.out.print(b + "<" + a + "<" + c);
            }else{
                System.out.println(b + "<" + c + "<" + a);
            }
        }
        else if((c < a) && (c < b)){
            if (a < b){
                System.out.print(c + "<" + a +"<" + b);
            }else{
                System.out.println(c + "<" + b + "<" + a);
            }        
        }else{
            System.out.println();
        }
    
}
}
