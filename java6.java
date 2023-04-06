import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {


            // your code goes here
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while (t-- > 0) {

                int x = in.nextInt();
                int y = in.nextInt();
                System.out.println((10 * x) + (90 * y));
            }
        }
    }
