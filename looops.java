public class looops {
    public static void main(String[] args) {
        int a=5;
        for (int m = 0; m <= a; m++) {
            for (int n = 1; n <=m; n++) {

                System.out.print(" ");
            }
            for (int n =a; n>=1;n--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
