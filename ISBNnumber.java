public class ISBNnumber {
    public static void main(String[] args) {
        long a=1401601499;
        long sum=0;
        sum=sum+a%10*10;
        a=a/10;
        sum=sum+a%10*9;
        a=a/10;
        sum=sum+a%10*8;
        a=a/10;
        sum=sum+a%10*7;
        a=a/10;
        sum=sum+a%10*6;
        a=a/10;
        sum=sum+a%10*5;
        a=a/10;
        sum=sum+a%10*4;
        a=a/10;
        sum=sum+a%10*3;
        a=a/10;
        sum=sum+a%10*2;
        a=a/10;
        sum=sum+a;

        System.out.println(sum);
        System.out.println(sum%11==0);
    }
}
