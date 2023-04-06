public class arrycompare {
    public static void main(String[] args) {
        int arr[] = {2,149, 69, 77, 145, 20,1};
        int firstgret=Math.max(arr[0],arr[1]);
        int secondgret=Math.min(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>firstgret){
                secondgret=firstgret;
                firstgret=arr[i];

            } else if (arr[i]>secondgret) {
                secondgret=arr[i];

            }

        }
        System.out.println(firstgret);
        System.out.println(secondgret);
    }
}
