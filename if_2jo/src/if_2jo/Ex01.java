package if_2jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, n5;
		int sum;
		System.out.println("1~5과목 시험 점수를 입력하시오(0~100점사이) : ");
		System.out.print("n1 : ");
		n1 = sc.nextInt();
		System.out.print("n2 : ");
		n2 = sc.nextInt();
		System.out.print("n3 : ");
		n3 = sc.nextInt();
		System.out.print("n4 : ");
		n4 = sc.nextInt();
		System.out.print("n5 : ");
		n5 = sc.nextInt();
		sum = n1 + n2 + n3 + n4 + n5;
		if(sum >= 400) {
			if(n1 < 60 || n2 < 60 || n3 < 60 || n4 < 60 || n5 < 60 ) {
			System.out.println("불합격입니다.");
			}
			else {
				System.out.println("합격입니다.");
			}
		}
		else {
			System.out.println("불합격입니다.");
		}
	}

}
