package if_4jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1, name2;
		int num1, num2;
		System.out.print("이름 입력 : ");
		name1 = sc.next();
		System.out.print("숫자 입력(1~6)사이 : ");
		num1 = sc.nextInt();
		System.out.print("이름 입력 : ");
		name2 = sc.next();
		System.out.print("숫자 입력(1~6)사이 : ");
		num2 = sc.nextInt();
		
		if((1 > num1) || (6 < num1) || (1 > num2) || (6 < num2)) 
			System.out.println("1~6사이의 숫자만 입력해주세요");
		else if(num1 > num2) {
			System.out.println("[" + name1 + "]님 승리" );
		}
		else if(num1 < num2) {
			System.out.println("[" + name2 + "]님 승리" );
		}
		else {
			System.out.println("무승부");
		}

	}

}
