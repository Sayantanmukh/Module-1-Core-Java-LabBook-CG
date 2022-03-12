package lab3;

import java.util.Scanner;

public class Ex2 {
	static String getImage(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		//StringBuffer  s1=sb.reverse();
		String x=s+"|"+sb.reverse();
		return x;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(Ex2.getImage(s));
		sc.close();
	}

}
