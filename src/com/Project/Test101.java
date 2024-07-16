package com.Project;

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
		
		
	}

	public static void main(String[] args) {
		Test101 obj=new Test101();
		obj.meth1();
		// TODO Auto-generated method stub

	}

}
