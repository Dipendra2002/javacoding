import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.println("you are able to voting");
        } else {
            System.out.println("you are eligible for in " + (18 - age) + "years");
        }
    }
}
