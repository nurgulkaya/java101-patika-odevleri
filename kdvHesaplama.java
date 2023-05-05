import java.util.Scanner;

public class kdvHesaplama{
    public static void main(String[] args) {

        double kdv = 0;
        double tutar,toplam;
        Scanner inp = new Scanner(System.in);
       
        System.out.println("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();

        if(tutar >= 0 && tutar <= 1000){
           kdv = (tutar/100)*18;
           toplam = tutar + kdv;
        }else{
           kdv = (tutar/100)*8;
           toplam = tutar + kdv;
        }

        System.out.println("KDV Tutarı: " + kdv);
        System.out.println("KDV Dahil Toplam Tutar: " +toplam);
    }
}


