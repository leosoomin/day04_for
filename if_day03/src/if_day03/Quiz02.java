package if_day03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("세 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		/*
		if(num1 > num2 && num1 > num3) 
			System.out.println("num1이 제일 크다");
		if(num1 > num2 && num1 < num3)
			System.out.println("num3가 제일 크다");
		if(num1 == num2 && num1 < num3)
			System.out.println("num3가 제일 크다");
		if(num1 == num2 && num1 > num3)
			System.out.println("num1,num2가 제일 크다");
		
		if(num1 < num2 && num2 < num3)
			System.out.println("num3가 제일 크다");
		if(num1 < num2 && num2 > num3)
			System.out.println("num2가 제일 크다");
		if(num1 < num2 && num2 == num3)
			System.out.println("num2,num3가 제일 크다");
		if(num1 == num2 && num1 == num3)
			System.out.println("num1 == num2 == num3");
		*/
		int max = 0;
	      if(num1 > num2) {
	         max = num1;
	      }
	      if(num2 > num1) {
	         max = num2;
	      }
	      if(num3 > max) {
	         max = num3;
	      }
	      System.out.println("가장 큰 수 : "+max);
	      
	}
}
