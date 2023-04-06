import java.util.Scanner;

public class switche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:-");
        int n = sc.nextInt();
        switch (n){
            case 1-> System.out.println("Monday"); //lamda expresion -> in the place of : that?

            case 2->System.out.println("Tuesday");

            case 3->System.out.println("Wednesday");

            case 4->System.out.println("Thrusday");

            case 5->System.out.println("Friday");

            case 6->System.out.println("Saturday");

            case 7->System.out.println("Sunday");

            default->System.out.println("Invalid input");
        }
    }
}
