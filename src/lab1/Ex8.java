package lab1;

import java.util.Scanner;

public class Ex8 {
	static boolean powerOf2(int n)
	{
	  
	  if (n == 1)
	    return true;
	  else if (n % 2 != 0 ||
	           n ==0)
	    return false;
	 
	  
	  return powerOf2(n / 2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if (powerOf2(n) == true)
		    System.out.print("True" + "\n");
		  else System.out.print("False" + "\n");
		 
	}
}
