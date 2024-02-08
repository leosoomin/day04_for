package if_5jo;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, money;
		System.out.print("나이와 금액을 입력하시오 : ");
		age = sc.nextInt();
		money = sc.nextInt();
		
		if(age >= 10 && age <= 15) {
			if(money >= 13000) {
				System.out.println("어린이표 구매 가능");
			}
			else {
				System.out.println("구매 못함");
			}
		}
		if(age >= 20) {
			if(money >= 15000) {
				System.out.println("성인표 구매 가능");
			}
			else {
				System.out.println("구매 못함");
			}
		}
	}
	
}
