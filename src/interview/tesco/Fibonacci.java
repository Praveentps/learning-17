package interview.tesco;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        fibonacciSeries(n,0,1);
    }

    private static void fibonacciSeries(int n,int a,int b) {
        int sum=a+b;
        a=b;
        b=sum;
        if (sum<n){
        System.out.println(sum);
        fibonacciSeries(n,a,b);}else {
            return;
        }
    }
}
