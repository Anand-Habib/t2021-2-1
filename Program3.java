package com.javatest;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Sequence2 z=new Sequence2();
		 z.seq2();
	}

}
class Sequence2{
	public void seq2(){
		Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the number: ");
		   int n=scan.nextInt();
		   int z=1;
		   if(n%2==0){
			   n=n-1;}
		   for(int i=1;i<=n;i++)
		   {
		    System.out.print(z+" ");
		    z=z+2;
		   }
		   scan.close();
		}
	
	}
	