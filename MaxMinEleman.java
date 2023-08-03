import java.util.Arrays;
import java.util.Scanner;

public class MaxMinEleman {
        public static void main(String[] args) {
            int[] list = {56, 34, 1, 8, 101, -2, -33};
          
            int min = list[0];
            int max = list[0];
    
            for (int i : list) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("Minimum Değer " + min);
            System.out.println("Maximum Değer " + max);

            Arrays.sort(list);
            for(int i : list){
                System.out.println(i + " ");
            }

            System.out.println("Bir sayı giriniz: ");
            Scanner k = new Scanner(System.in);
            int val = k.nextInt();

            int enYakinKucuk = Integer.MIN_VALUE;
            int enYakinBuyuk = Integer.MAX_VALUE;
    
            for(int j = 0; j < list.length; j++){                
                if (list[j] < val && list[j] > enYakinKucuk) {
                    enYakinKucuk = list[j];
                } else if (list[j] > val && list[j] < enYakinBuyuk) {
                    enYakinBuyuk = list[j];
                }
            }
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);  
        }
    }

