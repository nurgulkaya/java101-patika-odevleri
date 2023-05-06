import java.util.Scanner;

public abstract class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int km, age, tripType;
        double kmPer = 0.10;
        double normalAmount = 0;
        double discountAmount = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tripType = inp.nextInt();

        normalAmount = km * kmPer; 
        
        if(tripType == 1){

            if(age < 12){
              normalAmount = normalAmount - (normalAmount * 0.50);
              System.out.println("Toplam Tutar: " + normalAmount + "TL");
            }
            else if(age>=12 && age<=24){
              normalAmount = normalAmount - (normalAmount * 0.10);
              System.out.println("Toplam Tutar: " + normalAmount + "TL");
            }
            else if(age>65){
              normalAmount = normalAmount - (normalAmount * 0.30);
              System.out.println("Toplam Tutar: " + normalAmount + "TL");
            }
            else{
                System.out.println("Normal Tutar: "+ normalAmount);
            }

        }
        else if(tripType == 2){

            if(age<12){
                normalAmount = normalAmount - (normalAmount * 0.50);
                discountAmount = 2*(normalAmount - (normalAmount * 0.20));
                System.out.println("Toplam Tutar: " + (discountAmount) + "TL");  
            }
            else if(age>=12 && age<=24){
                normalAmount = normalAmount - (normalAmount * 0.10);
                discountAmount = 2*(normalAmount - (normalAmount * 0.20));
                System.out.println("Toplam Tutar: " + (discountAmount) + "TL");            
            }
            else if(age>65){
                normalAmount = normalAmount - (normalAmount * 0.30);
                discountAmount = 2*(normalAmount - (normalAmount * 0.20));
                System.out.println("Toplam Tutar: " + (discountAmount) + "TL"); 
            }
            else{
                discountAmount = 2*(normalAmount - (normalAmount * 0.20));
                System.out.println("Toplam Tutar: " + (discountAmount) + "TL");             }
        }
        else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
        
    }
}
