package com.javatest;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Sequence1 z=new Sequence1();
		 z.seq1();
		
	}
}
class Sequence1{
	public void seq1(){
		Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the number: ");
		   int n=scan.nextInt();
		   int z=1;
		   for(int i=1;i<=n;i++)
		   {
		    System.out.print(z+" ");
		    z=z+2;
		   }
		   scan.close();
		}
	
	}
	
	
