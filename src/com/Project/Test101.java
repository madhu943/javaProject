package com.Project;

import java.util.Arrays;

public class Test101 {
	void meth1() {
		System.out.println("Implementing Array");
		int arr[];
		arr=new int[5];
		int arr1[]=new int[4];
		int arr2[]= {11,22,33};
		int arr3[]=new int[] {100,200,300,400,500};
		
		String s="java";
		System.out.println("\narr[] length:"+arr.length);
		System.out.println("\narr1[] length:"+arr1.length);
		System.out.println("\narr2[] length:"+arr2.length);
		System.out.println("\narr3[] length:"+arr3.length);
		
		System.out.println("s length:"+s.length());
		System.out.println("\n arr:"+arr);
		System.out.println("\n arr1:"+arr1);
		System.out.println("\n arr2:"+arr2);
		System.out.println("\n arr3:"+arr3);
		
		System.out.println("========================");
		
		System.out.println("\n arr:"+Arrays.toString(arr));
		System.out.println("\n arr1:"+Arrays.toString(arr1));
		System.out.println("\n arr2:"+Arrays.toString(arr2));
		System.out.println("\n arr3:"+Arrays.toString(arr3));
		
		arr[1]=25;
		arr[3]=45;
		System.out.println("\n arr"+Arrays.toString(arr));
		
		System.out.println("\n"+arr[2]);
		System.out.println(arr[arr1.length-2]);
		//System.out.println(arr1[arr1.length]);
		System.out.println(arr1[arr1.length-2]);
		System.out.println(arr2[arr2.length-1]);
		System.out.println(arr3[arr3.length/2]);
		
		
		System.out.println("\nReteriving using for loop ");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i] + " ");
			
		}
		System.out.println();
		for(int i=arr3.length-1;i>=0;i--) {
			System.out.println(arr3[i]);
		}
		System.out.println("\n Reteriving using for each-loop");
		for(int x:arr3) {
			System.out.println(x+" ");
		}
	}

	public static void main(String[] args) {
		Test101 obj=new Test101();
		obj.meth1();
		// TODO Auto-generated method stub

	}

}
