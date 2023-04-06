import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int a = 8;
//        for (int i=1; i<=a; i++){
//            //System.out.print("*");
//            for (int j=a-1; j<=1;j--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i;j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//        }
//        for (int i=a; i>=1; i--){
//            //System.out.print("*");
//            for (int j=a-1; j<=1;j--) {
//                System.out.print(" ");
//            }
//            for (int j=2; j<=i;j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//        }

        for (int i = a; i >= 1; i--) {
            //System.out.print("*");
            for (int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
