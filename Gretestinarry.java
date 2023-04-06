public class Gretestinarry {
    public static void main(String[] args) {
        int arr[]={84,48,122,71,4};
        int gretest=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[gretest])

                gretest=i;

        }
        System.out.println("Gretest element ="+ arr[gretest]+"Found at"+gretest+"index");
    }
}
