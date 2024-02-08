package Quiz_2jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int num;
		System.out.println("================");
	
		while(true) {
		System.out.println("현재 숫자는 " + result + " 입니다.");
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		if(num >= 1 && num <= 20) {
			if(num % 2 == 0) {
				result += num;
				if(result == 100) {
					System.out.println("100이 되엇습니다. 종료합니다.");
					break;
				}
				else if(result <= 100) {
					System.out.println("숫자를 더합니다.");
				}
				else {
					result -= num;
					System.out.println("숫자가 100을 초과합니다. 다시 입력해주세요.");
				}
			}		
			else {
				result -= num;
				if(result < 0) {
					result += num;
					System.out.println("합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요.");
				}
				else {
					System.out.println("숫자를 뺍니다.");
				}
			}
		}
		else {
			System.out.println("1~20사이의 숫자를 입력하시오.");
		}
		}
	}
}
