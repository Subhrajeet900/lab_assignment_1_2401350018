public class Task3Recursion {

    static int calls = 0;

    public static long factorial(int n){
        if(n==0)
            return 1;
        return n * factorial(n-1);
    }

    public static int fibonacciRecursive(int n){
        calls++;
        if(n<=1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int fibonacciDP(int n){
        int fib[] = new int[n+1];

        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=n;i++)
            fib[i] = fib[i-1] + fib[i-2];

        return fib[n];
    }

    public static void main(String args[]){

        int n=10;

        long start,end;

        start=System.nanoTime();
        System.out.println("Factorial: "+factorial(n));
        end=System.nanoTime();
        System.out.println("Time: "+(end-start));

        start=System.nanoTime();
        System.out.println("Fibonacci Recursive: "+fibonacciRecursive(n));
        end=System.nanoTime();
        System.out.println("Function Calls: "+calls);
        System.out.println("Time: "+(end-start));

        start=System.nanoTime();
        System.out.println("Fibonacci DP: "+fibonacciDP(n));
        end=System.nanoTime();
        System.out.println("Time: "+(end-start));
    }
}
