package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	static boolean Check(String s) {
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++)
            if (ch[i] != s.charAt(i)) 
                return false;
               
        return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(Ex8.Check(s));
		
		
		
	}

}
