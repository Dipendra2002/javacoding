import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);

        if (num =='A' || num=='a' || num=='E'|| num=='e'|| num=='I'||num=='i'||num=='O'||num=='o'||num=='U'||num=='u'){
            System.out.println("it is vowel");
        }
        else {
            System.out.println("It is consonant");
        }
    }
}
