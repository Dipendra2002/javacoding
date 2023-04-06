import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter a array");
        int [] arr =new int[n];
        int sum=0;
        double avg =0;
        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("Sum="+sum);
       avg=(double)sum/ arr.length;
        System.out.println("Mean ="+ avg);

    }

}
