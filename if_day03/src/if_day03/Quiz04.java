package if_day03;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하시오 : ");
		num = sc.nextInt();
		/* 방법 1
		if(num % 3 ==0 && num % 4 == 0 && num != 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}
		if(num % 3 == 0 && num % 4 != 0) {
			System.out.println("3의배수에만 해당합니다.");
		}
		if(num % 3 != 0 && num % 4 == 0) {
			System.out.println("4의배수에만 해당합니다.");
		}
		if(num % 3 != 0 && num % 4 != 0) {
			System.out.println("3의배수도, 4의배수도 해당안됩니다.");
		}
		else if(num == 0) {
			System.out.println("0은 잘못입력했습니다.");
		}
		*/
		/* 2번째 방법
		if(num % 3 ==0 && num % 4 == 0 && num != 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}
		else if(num % 3 == 0 && num % 4 != 0) {
			System.out.println("3의배수에만 해당합니다.");
		}
		else if(num % 3 != 0 && num % 4 == 0) {
			System.out.println("4의배수에만 해당합니다.");
		}
		else if(num == 0) {
			System.out.println("0은 잘못입력했습니다.");
		}
		else {
			System.out.println("3의배수도, 4의배수도 해당안됩니다.");
		}
		*/
		if(num == 0) {
			System.out.println("0은 잘못입력했습니다.");
		}
		else if(num % 3 ==0 && num % 4 == 0 ) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}
		else if(num % 3 == 0) {
			System.out.println("3의배수에만 해당합니다.");
		}
		else if(num % 4 == 0) {
			System.out.println("4의배수에만 해당합니다.");
		}
		else {
			System.out.println("3의배수도, 4의배수도 해당안됩니다.");
		}
	}

}
