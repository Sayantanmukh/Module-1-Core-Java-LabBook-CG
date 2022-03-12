package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	static String[] sortStrings(String[] a) {
		Arrays.sort(a);
		//return a[1];
		int n=a.length, x=n/2;
		
		if(n%2==0) {
			x=n/2-1;
		}
		
		for(int i=0;i<=x;i++) {
			a[i]=a[i].toUpperCase();
		}
		for(int i=x+1;i<n;i++) {
			a[i]=a[i].toLowerCase();
		}
		
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		
		int n=sc.nextInt();sc.nextLine();
		
		String[] arr=new String[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		
		String[] arr1=Ex2.sortStrings(arr);
		
		System.out.println("Sorted array ");
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
