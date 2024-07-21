package com.Project;
import java.util.Arrays;
import java.util.Scanner;
public class Test103 {
	
	Scanner sc=new Scanner(System.in);
	void ticketBooking() {
		System.out.println("Hi what is your name ? ");
		String name=sc.next();
		System.out.println("Hi " +name+ " which movie you want to see");
		String movie=sc.next();
		System.out.println("ok how many tickets you need for "+movie+"?");
		int tickets=sc.nextInt();
		String names[]=new String[tickets];
		System.out.println("please enter " +names.length+ "names");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		System.out.println(names.length+" tickets were booked");
		for(String s:names) {
			System.out.println(s+" ??? ");
		}
		System.out.println(names.length+"tickets are booked for "+Arrays.toString(names)+"for movie");
		
	}

	public static void main(String[] args) {
		new Test103().ticketBooking();
		// TODO Auto-generated method stub

	}

}
