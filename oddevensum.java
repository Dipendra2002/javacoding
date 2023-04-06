import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int oddsum=0;
        int evensum=0;
        for (int i=1;i<=a; i++) {

            if (i % 2 == 0) {
                evensum = evensum + i;
                //System.out.println(evensum);

            } else {
                oddsum = oddsum + i;
               // System.out.println(oddsum);

            }
        }
        System.out.println("odd sum is"+oddsum);
        System.out.println("even sum is"+evensum);
    }
}
