package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	
	public static Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> map= new HashMap<>();
		
		for(char c: arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		return map;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		
		Map<Character, Integer> m= Ex2.countChars(ch);
		sc.close();
		System.out.println(m);
		
	}

}
