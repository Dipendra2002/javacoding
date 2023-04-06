public class HCFNEW {
    public static void main(String[] args) {
        int a=16, b =24;
        int i;
        for (i=Math.min(a,b); i>=1;i--){
            if (a%i==0&&b%i==0)
                break;

        }
        System.out.println(i);
    }
}
