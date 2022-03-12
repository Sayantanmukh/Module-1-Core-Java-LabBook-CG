package lab1;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 = RED");
		System.out.println("2 = YELLOW");
		System.out.println("3 = GREEN");
		System.out.println("Select a number");
		int n=sc.nextInt();
		switch(n) {
			case 1:
				System.out.println("STOP");
				break;
			case 2:
				System.out.println("READY");
				break;
			case 3:
				System.out.println("GO");
				break;
			default:
				System.out.println("INVALID INPUT");
				
			
		
		}
			
				
		
	}

}
