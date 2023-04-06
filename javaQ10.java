import java.util.Scanner;

public class javaQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        System.out.println("Enter number c");
        int c = sc.nextInt();
        if (a == b || b==c || c== a ){
            System.out.println("all are equal:-"+a+"  "+b+ " "+c);
        }// else if (a== b || b==) {

        //}
    }
}
