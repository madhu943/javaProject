package com.Project;

import java.util.Arrays;

public class Test106 {
	boolean[]meth1(){
		/*
		boolean flag[]=new boolean[3];
		flag[0]=true;
		flag[1]=false;
		flag[2]=true;
		return flag;
		*/
		return new boolean[] {true,false,true};
	}
	void meth2(int arr[]) {
		System.out.println("meth2 called .... test");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Test106 obj=new Test106();
		boolean result[]=obj.meth1();
		System.out.println(Arrays.toString(result));
		
		obj.meth2(new int[] {11,22,33,44});
		// TODO Auto-generated method stub

	}

}
