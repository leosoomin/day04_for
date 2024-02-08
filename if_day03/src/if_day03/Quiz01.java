package if_day03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1 > num2) 
			System.out.println("num1이 num2보다 크다");
		if(num1 < num2)
			System.out.println("num2가 num1보다 크다");
		if(num1 == num2)
			System.out.println("num1 == num2");
	}

}
