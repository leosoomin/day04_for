package if_day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if(num > 10)	// if문에 중괄호로 안묶어주면 참일 때 if문 뒤에 한 문장만 실행한다. 들여쓰기랑은 상관 없음
			System.out.println("1.종속문장실행");
		System.out.println("2.종속문장실행");
		System.out.println("3.종속문장실행");
		System.out.println("다음 문장들 실행!!!");
		
	}

}
