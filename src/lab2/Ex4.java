package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	static int removeDuplicates(int arr[]) {
	int n = arr.length;
	Arrays.sort(arr);
    
    	if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
         
        
        int j = 0;
        for (int i=0; i<n-1; i++)
            
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        
        temp[j++] = arr[n-1];  
         
        
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    
	}
	static int[] modifyArray(int[] arr) {
		int n = removeDuplicates(arr);
		int[] a=new int[n];int j=0;
		Arrays.sort(arr);
		for(int i=n-1;i>=0;i--) {
			a[j]=arr[i];
			j++;
		}
		return a;
	}
	
     
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int x= Ex4.removeDuplicates(arr);
        int a[] = new int[x];
         
        a = modifyArray(arr);
  
        // Print updated array
        for (int i=0; i<x; i++)
           System.out.print(a[i]+" ");
        sc.close();
    }
    
}
