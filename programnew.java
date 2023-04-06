import java.util.Scanner;

public class programnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int num= sc.nextInt();
        int Ch;
        System.out.println("Welcome to our calculator ");
        System.out.println("press 1 to add\npress 2 for subtrct\npress 3 for multiply");
        Ch = sc.nextInt();

        if (Ch==1){
            System.out.println("Enter your two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Your sum is "+(a+b));
        }
        else if (Ch==2){
            System.out.println("Enter your two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Your remainder is "+(a-b));
        }
       else if (Ch==3){
            System.out.println("Enter your two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Your multiply  is "+(a*b));
        }
        else {
            System.out.println("wrorng input");
        }


    }
}
