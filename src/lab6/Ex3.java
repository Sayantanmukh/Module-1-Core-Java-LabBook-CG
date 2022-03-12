package lab6;

import java.util.HashMap;

public class Ex3 {
	
	public static HashMap<Integer,Integer> getSquares(int[] a){
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		int[] s= new int[a.length];
		for(int i=0;i<a.length;i++) {
			s[i]=a[i]*a[i];
			hm.put(a[i], s[i]);
		}
		return hm;
		
		
	}
	
	
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8,9,10};
		HashMap<Integer, Integer> hm=Ex3.getSquares(a);
		System.out.println(hm);
	}
}
