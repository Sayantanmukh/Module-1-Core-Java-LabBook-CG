package lab1;

import java.util.Scanner;

public class Ex7 {
	static boolean checkNumber (int num) {
		
		 int currentDigit = num % 10;
	       num = num/10;

	      
	   boolean flag=false;
		while(num>0){
	           
	           if(currentDigit < num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }

	      
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		 if(checkNumber(n)==true){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	}
}
