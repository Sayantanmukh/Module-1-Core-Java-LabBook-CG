package lab3;

import java.util.Scanner;

public class Ex3 {
	static String alterString(String s) {
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Ex3.isConsonant(ch[i])) {
				ch[i]= (char)(((int) ch[i])+1);
			}
		}
		String str = new String(ch);
		 
        return str;
		
	}
	static boolean isConsonant(char c) {
		if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u'  || c=='A'|| c=='E'|| c=='I' || c=='O' || c=='U') {
			return false;
		}
		else return true;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(Ex3.alterString(s));
		sc.close();
	}

}
