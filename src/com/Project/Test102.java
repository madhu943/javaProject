package com.Project;

public class Test102 {
	
	void meth1() {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Test102().meth1();
		
		// TODO Auto-generated method stub

	}

}
