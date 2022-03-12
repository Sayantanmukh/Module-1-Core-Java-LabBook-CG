package lab1;

import java.util.Scanner;

public class Ex3 {
	
	static int recFibo(int n) {
		int n1=1,n2=1;
		if (n>2) {
			return recFibo(n-1)+recFibo(n-2);
		}
		else {
			return 1;
		}
	}
	static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println(n+"th Fibonacci no is "+Ex3.fib(n)+" wihout using recursion");
			System.out.println(n+"th Fibonacci no is "+Ex3.recFibo(n)+" using recursion");
		}
		
	}
}
