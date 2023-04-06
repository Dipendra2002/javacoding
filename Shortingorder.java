public class Shortingorder {
    public static void main(String[] args) {
        int arr[] = {2,15,54,64,67, 69, 77, 145,149};
        int target=15;
        int ans=-1;
        int start=0, end= arr.length-1;

        while (start<=end){
            int midindex=(start+end)/2;
            if (target==arr[midindex]){
                ans=midindex;
                break;
            }
            if (target>arr[midindex])
                start=midindex+1;
            else
                end=midindex-1;

        }
        System.out.println("Number of arrays   "+arr[ans]+" at index "+ans);
    }
}
