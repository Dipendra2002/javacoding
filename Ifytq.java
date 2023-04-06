import java.util.Scanner;

public class Ifytq {
    public static int pow(int n)
    {
        if(n==0)
            return 1;
        return 2*pow(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int prod=1;
            for(int j=0;j<i;j++)
            {
                prod*=2;
            }
            System.out.println(prod+" ");
        }
//        System.out.println(pow(3));
    }
}
