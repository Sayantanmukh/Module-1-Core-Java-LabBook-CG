package lab1;

import java.util.Scanner;

public class Ex4 {
	static boolean isPrime(int n) {
		int f=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				f++;
			}
			else continue;
		}
		if(f>0) {
			return false;
		}
		else return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
			else continue;
		}
	}
}
