package Quiz_2jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
			while(true) {
			System.out.print("점수를 입력하시오 :  ");
			score = sc.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("잘못입력했습니다.");
				break;
			}
			else if(score >= 80) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
			}

	}

}