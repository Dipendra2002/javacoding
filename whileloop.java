import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int a = sc.nextInt();
        int copy=a;
        int rev=0;

        while (a!=0){
            int n=a%10;
            rev=rev*10+n;
            a=a/10;

        }
        System.out.println(rev==copy?"palidrome":"non palindrome");
    }
}
