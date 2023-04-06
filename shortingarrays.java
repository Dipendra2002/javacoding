import java.util.Arrays;

public class shortingarrays {
    public static void main(String[] args) {
        int arr[] = {2,-149, 69, -77, -145, 20,1};
        int temp[]=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                temp[k]=arr[i];
                k++;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > 0) {
                    temp[k] = arr[i];
                    k++;

                }
            }

        }
        System.out.println(Arrays.toString(temp));

    }
}
