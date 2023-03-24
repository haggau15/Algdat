package Recursion;

public class Fibonacci {
    public static void main(String[] args)
    {
        int n=7;
        for (int i =0;i<1;i++)
        {
            //System.out.print(fibonacci(i)+" ");
        }
        System.out.println("Factorial of "+n+": "+factorial(n));
    }
    public static int fibonacci(int n)
    {
        if (n<=0)
        {
            return 0;
        }
         else if (n==1 || n==2){
             return 1;
         }    else {
             return (fibonacci(n-1)+fibonacci(n-2));
         }
    }
    public static int factorial(int n)
    {
        if (n==1)
        {
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }

}
