import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
