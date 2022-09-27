package com.javatest;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Calculator1 c=new Calculator1();
		Scanner scan=new Scanner (System.in);
		System.out.println("please enter 1st no :");
		double a=scan.nextDouble();
		System.out.println("please enter 2nd no :");
		double b=scan.nextDouble();
		scan.nextLine();
		System.out.println("please enter the operation to perform (add,sub,mul,div):");
		String s=scan.nextLine();
		if(s.equals("add")){
			c.add(a, b);
		}
		else if(s.equals("sub")){
			c.sub(a, b);
			
		}
		else if(s.equals("mul")){
			c.mul(a, b);
			
		}
		else if(s.equals("div")){
			c.div(a, b);
			
		}
		else{
			System.out.println("input is wrong");
		}
	}

}
class Calculator1{
	public void add(double a,double b){
		double sum=a+b;
		System.out.println("sum ="+sum);
	}
	public void sub(double a,double b){
		double sub=a-b;
		System.out.println("sub ="+sub);
	}
	public void mul(double a,double b){
		double mul=a*b;
		System.out.println("mul ="+mul);
	}
	public void div(double a,double b){
		double div=a/b;
		System.out.println("div="+div);
	}
}

