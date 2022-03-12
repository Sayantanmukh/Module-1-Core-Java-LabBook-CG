package lab3;

import java.util.Scanner;

public class Ex4 {
	static int modifyNumber(int n) {
		String s=Integer.toString(n);
		char[] ch=s.toCharArray();
		int [] arr=new int[ch.length];
		int [] a=new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			arr[i]=(int) ch[i];
		}
		
		StringBuffer sb=new StringBuffer();
		
		
		for(int i=0;i<a.length-1;i++) {
			a[i]=Math.abs(arr[i+1]-arr[i]);
			sb.append(a[i]);
		}
		a[a.length-1]=Math.abs(arr[arr.length-1]-arr[0]);
		sb.append(a[a.length-1]);
		
		return Integer.parseInt(sb.toString());
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println(Ex4.modifyNumber(a));
	}

}
