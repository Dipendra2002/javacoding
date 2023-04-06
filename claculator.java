import java.sql.SQLOutput;
import java.util.Scanner;

public class claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for calculation 1 for sum 2 for subtract 3 for divide 4 for multiply");
        int a= sc.nextInt();
        System.out.println("Enter a first number");
        int b = sc.nextInt();
        System.out.println("enter a second number");
        int c = sc.nextInt();


        if (a==1){

            System.out.println("your addition is : "+b+c);
        } else if (a==2) {
            System.out.println("your subtract is : "+(b-c));

        } else if (a==3) {
            System.out.println("Your divide is : "+b/c);

        } else if (a==4) {
            System.out.println("your multiplication is : "+b*c);

        }
        else {
            System.out.println("invalid input");
            System.out.println("pls read care fully above sentances");
        }


    }
}
