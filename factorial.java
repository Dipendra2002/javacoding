import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=a;i++ ) {
           // sum = sum + i;

            //System.out.println(sum);
            if (a%i==0){
                sum =sum+i;
               System.out.println(i);
            }
        }

        System.out.println(sum);
    }
}
