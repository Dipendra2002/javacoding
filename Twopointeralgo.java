import java.util.Arrays;

public class Twopointeralgo {
    public static void main(String[] args) {
        int arr[] = {2,149, 69, 77, 145, 20,1};
        int i=0;
        int j= arr.length-1;


        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
