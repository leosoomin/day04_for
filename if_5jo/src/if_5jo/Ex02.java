package if_5jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("물건의 무게를 입력하시오 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int sum = a + b + c;
		int p = sum - 600;
		if(sum > 600) {
			System.out.println("무게가 600kg를 초과하였습니다." + p + "kg을 제외하시오.");
		}
		else {
			if(a > b && a > c) {
				System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
				System.out.println("남은 무게는" + -p + "kg 입니다.");
				System.out.println("가장 무거운 무게는 " + a + "입니다.");
			}
			else if(a > b && a < c) {
				System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
				System.out.println("남은 무게는 " + -p + "kg 입니다.");
				System.out.println("가장 무거운 무게는 " + c + "입니다.");
			}
			else if(a < b && b > c) {
				System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
				System.out.println("남은 무게는" + -p + "kg 입니다.");
				System.out.println("가장 무거운 무게는 " + b + "입니다.");
			}
			else if(a < b && b < c){
				System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
				System.out.println("남은 무게는" + -p + "kg 입니다.");
				System.out.println("가장 무거운 무게는 " + c + "입니다.");
			}
		}
	}

}
