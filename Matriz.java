// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;


public class Main {
    public static void main(String args[]) {
        int i = 10;
        int j = 15;
        int [][] mat = new int[i][j];
        int x;
        int y;
        for (x = 0; x < i; x++) {
            for (y=0;y<j;y++) {
                Random random = new Random();
                mat[x][y] = random.nextInt(10);
            }
        }
        //System.out.print("[");
        for (x = 0; x < i; x++) {
            for (y=0;y<j;y++){
                System.out.print(mat[x][y]+" ");
            }
            System.out.println("");
        }
        //System.out.println("]");
    }
}
