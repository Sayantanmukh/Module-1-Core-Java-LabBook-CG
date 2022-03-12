package lab1;

import java.util.Scanner;

public class Ex6 {
	static int calculateDifference (int n) {
		int sq=0,s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
			int x=i*i;
			sq+=x;
		}
		return sq-(s*s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}
