package switch_day04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력");
		str = sc.next();
		switch(str) {	// switch문 숫자,문자열 모두 사용 가능
		case "안녕" : System.out.println("하세요"); break;
		case "그래" : System.out.println("반갑다!"); break;
		default : System.out.println("그 외의 값");
		}
	}

}
