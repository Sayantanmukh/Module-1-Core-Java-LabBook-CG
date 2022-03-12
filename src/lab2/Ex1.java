package lab2;

import java.util.*;



public class Ex1 {
	
	static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
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
		System.out.println("Second smallest no. in array is "+Ex1.getSecondSmallest(arr));
		
	}

}
