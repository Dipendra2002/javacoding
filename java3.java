import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter gender");
        char Gender = sc.next().charAt(0);

        if (Gender =='M'|| Gender=='m'){

            System.out.println("good morning sir");
        } else if (Gender == 'F' ||  Gender=='f') {
            System.out.println("Good morning ma'am");

        }
        else {
            System.out.println("Plese give right input");
        }

    }
}
