import java.util.Arrays;

public class shorting {
    public static void main(String[] args) {
        int arr[] = {2,5, 69, 77, 145,149};
        int temp[]=new int[arr.length];
        int j=0;
        for (int a = arr.length-1; a > 0; a--) {
             temp[j]=arr[a];
             j++;
            }
        for (int a = 0; a < temp.length; a++) {
            System.out.println(Arrays.toString(temp));
        }
        }

    }

