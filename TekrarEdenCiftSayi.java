import java.util.Arrays;

public class TekrarEdenCiftSayi {
    public static void main(String[] args) {
        int[] list = {22,42,0,85,42,42,22,0,76,21,12,0,12};
        Arrays.sort(list);

        int counter=0;
        int num = list[0];

        for(int i = 0; i < list.length; i++){
                int ciftSayi = list[i];
                if (ciftSayi == num) {
                    counter++;
                } else {
                    if (counter >= 1 && num % 2 == 0) {
                        System.out.println(num + ": " + counter + " kez tekrar ediyor.");
                    }
                    num = ciftSayi;
                    counter = 1;
                }
        }
    }
}

