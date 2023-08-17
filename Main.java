import java.util.Random;


public class Main {
    public static void main(String args[]) {
        int n = 10;
        int vec[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            Random random = new Random();
            vec[i] = random.nextInt(10);

        }
        System.out.print("[");
        for (i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(vec[i]);
            }
            else {
                System.out.print(vec[i] +",");
            }
        }
        System.out.print("]");
    }
}