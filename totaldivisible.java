import java.util.Scanner;

public class totaldivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i;
        for (i=1;i<n;i++){
            if (n%i==0) {
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.println("total is:-:"+sum);
    }
}
