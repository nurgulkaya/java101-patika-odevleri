import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        String newPassword;
        int onay;
        Scanner inp = new Scanner(System.in);


        System.out.println("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.println("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")){
            System.out.println("Giriş yaptınız.");
        }
        else{
            System.out.println("Bilgileriniz yanlış. Şifrenizi sıfırlamak ister misiniz? İstiyorsanız 1 yazın");
        }

        onay = inp.nextInt();
        inp.nextLine();
        if(onay == 1){

            System.out.println("Yeni şifreyi giriniz: ");
            newPassword = inp.nextLine();

            if (newPassword.equals(password) || newPassword.equals("java101")){
               System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else{
               System.out.println("Şifre oluşturuldu");
            }
        }else{
            System.out.println("Lütfen tekrar deneyin");
        }
    }
    
}  

    
