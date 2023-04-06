import java.util.Scanner;

public class javaQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pinciple:-");
        int p= sc.nextInt();
        System.out.println("Enter your rate :-");
        int r = sc.nextInt();
        System.out.println("Enter your Time in years:-");
        int t = sc.nextInt();

        int si = p*r*t/100;
        System.out.println("Your simple interest is :-"+si);

    }
}
