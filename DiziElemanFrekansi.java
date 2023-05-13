import java.util.Arrays;

public class DiziElemanFrekansi {
    public static void main(String[] args) {
        int i;
        int count = 1;
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(array);

        int first=1;
        System.out.println("Tekrar eden sayılar:");
        for(i=0;i<array.length;i++){
            if(first!=array[i]){
	            for(int j=0;j<array.length;j++){
	                if ((i!=j)&&(array[i]==array[j])) {
	                    first=array[i];
                        count++;
	                }
	            }
                System.out.println(array[i] + " sayısı " + count + " kez tekrar edildi.");
              } count = 1;

             
        }
    }
}
