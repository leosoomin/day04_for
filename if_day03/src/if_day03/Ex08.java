package if_day03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		/*
		if(num > 100) {
			System.out.println("100보다 큰 수");
		}else if(num >= 50) {
			System.out.println("50이상 100 이하인 수");
		}else if(num >= 0) {
			System.out.println("0이상 50보다 작은 수");
		}
		else {
			System.out.println("음수");
		}
		System.out.println("다음 문장들 실행");
		*/
		
		if(num > 100) {
			System.out.println("100보다 큰 수");
		} if (num > 50) {
			System.out.println("50보다 큰 수");
		} if (num > 0) {
			System.out.println("0보다 큰 수");
		}
		else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		
		// 입력값이 짝수고, 50보다 크다면
		if(num% 2 == 0) {
			System.out.println("짝수");
		}if(num > 50) {
			System.out.println("50보다 크다");
		}
		// --> if문 뒤에 if문 쓰면 개별적으로 if문 모두를 실행하고 if문 뒤에 else if문 쓰면 조건에 따라 맞는 문장만 실행한다.
		// --> if-if와 if-else if의 차이점 알고있기
	}
}