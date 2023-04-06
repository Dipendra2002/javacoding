import java.util.Scanner;

public class Shopingdiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        if (total>0 && total>=5000){
            System.out.println(total-(0*total/100));
        } else if (total>5000 && total<=7000){
            System.out.println(total-(5*total/100));

        }
        else if (total>7000 && total<=9000){
            System.out.println(total-(10*total/100));

        }
        else{
            System.out.println(total-(20*total/100));

        }
    }
}
