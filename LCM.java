public class LCM {
    public static void main(String[] args) {
        int a=16, b =24;
        int i;
        for (i=Math.max(a,b); i<=a*b;i++){
            if (i%a==0&&i%b==0)
                break;

        }
        System.out.println(i);

    }
}
