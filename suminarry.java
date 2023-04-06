public class suminarry {
    public static void main(String[] args) {
        int arr[] = {2, 149, 69, 77, 145, 20, 1};
        int gretest = 0;
        int secondgretest = 0;
        int gretestindex = 0;
        int secondgretestindex = 0;
        int sumgretest = 0;
        int sumlowest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > gretest) {
                secondgretest = gretest;
                gretest = (arr[i]);
                secondgretestindex = gretestindex;
                gretestindex = i;
                sumgretest = sumgretest + arr[i];
               // sumlowest = sumlowest +arr[i] ;

            } else if (arr[i] < secondgretest) {

                secondgretest = arr[i];
                secondgretestindex = i;
               // sumlowest = sumlowest +arr[i] ;
            }
            sumlowest = sumlowest +arr[i] ;
        }
        System.out.println(sumgretest);
        System.out.println(sumlowest);
    }
}
