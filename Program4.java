package com.javatest;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		 ArrayCheck g=new ArrayCheck();
		  g.dup1();

		}

	}
	class ArrayCheck{
		public void dup1(){
			Scanner scan= new Scanner(System.in);
			System.out.println("please enter array size:");
			int n=scan.nextInt();
			int a[]=new int[n];
			int b[]={1,2,3,4,5,6,7,8,9};
			for(int i=0;i<n;i++){
				System.out.println("please enter index:"+i);
				a[i]=scan.nextInt();

			}
			System.out.println("output:");
			System.out.print("{");
		for(int i=0;i<b.length;i++){
			int count=0;
			for(int j=0;j<a.length;j++){
				if(a[j]%b[i]==0){
					count++;
				}
				
			}
			System.out.print(b[i]+":"+count+",");
			
		
			
		}
		
		System.out.print("}");
		

			
			
		
	}
}