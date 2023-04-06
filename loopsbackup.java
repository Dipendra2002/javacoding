public class loopsbackup {
    public static void main(String[] args) {
        int a = 8;
           for (int m = 1; m <= a-1; m++) {
                for (int n = 1; n <= a-m; n++) {

                    System.out.print(" ");
                }
                for (int n =0; n<m;n++ ){
                    System.out.print("* ");
                }
                System.out.println();
            }
        for (int m = a; m >= 1; m--) {
            for (int n = 1; n <= a-m; n++) {

                System.out.print(" ");
            }
            for (int n =0; n<m;n++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    }


