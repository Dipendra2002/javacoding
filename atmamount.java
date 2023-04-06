import java.util.Scanner;

public class atmamount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt  = sc.nextInt();
        if (amt>=2000){
            System.out.println("notes of 2000 are :-"+amt/2000);
            amt=amt%2000;

        }
        if (amt>=500){
            System.out.println("notes of 500 are :::"+amt/500);
            amt=amt%500;
        }
        if (amt>=200){
            System.out.println("notes of 200 are :::"+amt/200);
            amt=amt%200;

        }
        if (amt>=100){
            System.out.println("notes of 100 are :::"+amt/100);
        amt=amt%100;

        }
        if (amt>=50){
            System.out.println("notes of 50 are :::"+amt/50);
            amt=amt%50;
        }
        if (amt>=20){
            System.out.println("notes of 100 are :::"+amt/20);
            amt=amt%20;

        }
        if (amt>=10){
            System.out.println("notes of 10 are :::"+amt/10);
            amt=amt%10;

        }
        if (amt>=5){
            System.out.println("coin of 5 are :::"+amt/5);
            amt=amt%5;

        }
        if (amt>=2){
            System.out.println("coin of 2 are :::"+amt/2);
            amt=amt%2;

        }
        if (amt>=1){
            System.out.println("coin of 1 are :::"+amt/1);
            amt=amt%1;



        }
        System.out.println("Your total amount is"+amt);
        System.out.println("Thanks for using our service\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F");

    }
}
