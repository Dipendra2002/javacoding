public class fabonacci {
    public static void main(String[] args) {
        int n = 10;
        int privious2=0;
        int privous1=1;

        for (int i=2; i<=n; i++){
            int ans=privous1+privious2;
            System.out.println(ans);

            privious2=privous1;
            privous1=ans;
        }
    }
}
