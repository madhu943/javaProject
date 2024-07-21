package com.Project;

import java.util.Arrays;

public class Test104 {
	String [] meth1(int arr1[],char arr2[],boolean arr3[]) {
		
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]+" ");
		}
		char c[]=new char[arr2.length];
		int j=arr2.length-1;
		for(int i=0;i<=c.length-1;i++,j--) {
			c[i]=arr2[j];
		}
		System.out.println(Arrays.toString(c));
		
		for(boolean b:arr3) {
			System.out.println(b);
		}
		
		return new String[] {"Kishan","Naresh","java"};
	}

	public static void main(String[] args) {
		Test104 obj=new Test104();
		char input[]= {'j','a','v','a'};
		String result[]=obj.meth1(new int[] {10,20,30},input,new boolean[] {true,false,true,false});
		System.out.println("1st element "+result[0]);
		System.out.println("2st element "+result[2]);
		// TODO Auto-generated method stub

	}

}
