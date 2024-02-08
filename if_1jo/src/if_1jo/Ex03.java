package if_1jo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("문자열을 입력하시오 : ");
		s = sc.next();
		if(s.contains("a")) {
		// 문자열 s에 a가 포함되었는지를 판단하는 조건문.	(" " 큰 따옴표로 묶어줘야하는 이유는?)
			System.out.println("a를 포함하였습니다.");
		}
		else {
			System.out.println("문장이 a가 없습니다.");
		}

	}

}
