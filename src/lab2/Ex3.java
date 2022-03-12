package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	
	static int reverse(int n){
        
	      String nstr="";
	       char ch;
	      String s= Integer.toString(n);
	      for (int i=0; i<s.length(); i++)
	      {
	        ch= s.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      return Integer.parseInt(nstr);
	      
	    }
	static int[] getSorted(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]=Ex3.reverse(a[i]);			
		}
		Arrays.sort(a);
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		Ex3.getSorted(arr);
		System.out.println("Result");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);	
		}
	}
}
