package if_1jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		if(num >= 0 ) {
			System.out.println(num + "은 양수입니다.");
		}
		else {
			System.out.println(num + "은 음수입니다.");
		}
	}
}
