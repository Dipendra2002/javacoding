import java.util.Scanner;

public class javaQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempereture in fahrenheit:- ");
        int F = sc.nextInt();
        float c = ((F-32) * 5/9f);
        System.out.println("your temperature is"+c+"°C");

    }
}
