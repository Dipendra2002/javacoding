public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {66, 4, 13, 9, 219, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }


        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
