import java.util.Scanner;

public class PalindromikKelime {
        static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
    
        static boolean isPalindrome2(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
    
            if (str.equals(reverse))
                return true;
            else
                return false;
        }
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir kelime giriniz: ");
            String word = input.next();
            if(isPalindrome(word) == true){
                System.out.println("Bu kelime palindromiktir.");
            }else{
                System.out.println("Bu kelime palindromik değildir.");
            }
        }
    }
