package if_2jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int grade;
		System.out.print("점수 : ");
		score = sc.nextInt();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		if(score >= 60) {
			if(grade == 4 && score >= 70) {
				System.out.println("합격");
			}
			else if(grade == 4 && score < 70) {
				System.out.println("불합격");
			}
			else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
	}

}