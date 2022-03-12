package lab1;

import java.util.*;

public class Ex1 {
	
	public static long cubeSum(long x) {
		long sum=0;
		while (x > 0) {
		    long digit = x % 10;
		    sum += digit * digit * digit;
		    x /= 10;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		long n =sc.nextLong();
		System.out.println("Sum of the cubes of the digits of "+n+" digit number= "+Ex1.cubeSum(n));
	}
}
