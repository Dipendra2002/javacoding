import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double amount = 0;

        if (units>400){
            amount=amount+(units-400)*13;
            units=400;
        }
        if (units>200){
            amount=amount+(units-200)*8;
            units=200;
        }

        if (units>100){
            amount=amount+(units-100)*6;
            units=100;
        }
        amount=amount+(units*4.2);
        System.out.println(amount);
    }
}
