
public class MatrisinTranspozu {
    public static void main(String[] args) {
        int i,j;
        int[][] matris = new int[2][3];
        matris[0][0] = 2;
        matris[0][1] = 3;
        matris[0][2] = 4;
        matris[1][0] = 5;
        matris[1][1] = 6;
        matris[1][2] = 4;
        System.out.println("Matris: ");
        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                System.out.print(matris[i][j] + " ");
            }
                System.out.println();
        }
        
        System.out.println("Transpoze: ");
        for (j=0; j<3; j++) {
            System.out.print(" ");
            for (i=0; i<2; i++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();

        }
    
      
    }
}
