import java.util.Arrays;

public class lestshifting {
    public static void main(String[] args) {
        int arr[] = {2,149, 69, 77, 145, 20,1};
        int k=2;
        k=k% arr.length;        //if any arrys is more arry element
//        int temp=arr[0];
        for (int j = 1; j <=k; j++) {
            int temp = arr[0];


            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
