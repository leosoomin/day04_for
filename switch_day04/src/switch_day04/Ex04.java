package switch_day04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		while(true) {	// while(조건식) { ... } 괄호 안에 내용이 반복된다.
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.println("입력한 이름 : " + name);
		}

	}

}
