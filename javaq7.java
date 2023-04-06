import java.util.Scanner;

public class javaq7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a marks in maths");
        int a = in.nextInt();
        System.out.println("Enter a marks in computer");

        int b = in.nextInt();
        System.out.println("Enter a marks in english");
        int c = in.nextInt();
        int sum = a+b+c;
            System.out.println("your total marks is:-"+sum);
            float percentage = sum/3f;
        System.out.println("your total percentage is:-"+percentage+"%");
        }
    }

