package Quiz_1jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.print("숫자를 입력하시오 : ");
		num = sc.nextInt();
		for(int i = 1; i <= num; i ++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
