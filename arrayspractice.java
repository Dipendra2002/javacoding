public class arrayspractice {
    public static void main(String[] args) {
        int arr[] = {2,149, 69, 77, 145, 20,1};
        int gretest = 0;
        int secondgretest = 0;
        int gretestindex=0;
        int secondgretestindex=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > gretest) {
                secondgretest=gretest;
                gretest= (arr[i]);
           secondgretestindex = gretestindex;
           gretestindex = i;
                }
            else if (arr[i]>secondgretest) {

                    secondgretest=arr[i];
                    secondgretestindex=i;
            }
        }
        System.out.println(gretest + "at position  "+(gretestindex));
        System.out.println(secondgretest + "at position " +(secondgretestindex));
    }
}

