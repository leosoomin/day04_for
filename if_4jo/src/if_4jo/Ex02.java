package if_4jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		int sum;
		double avg;
		
		System.out.print("국어, 영어, 수학 점수를 입력하세요 >> ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sum = kor + eng +math;
		avg = sum / 3.0;
		if(avg < 0 || avg >100) {
			System.out.println("잘못입력하셨습니다.");
		}
		else if(avg >= 90) {
			System.out.println("평균 점수는 " + avg +"이며, 등급은 A입니다.");
		}
		else if(avg >= 80) {
			System.out.println("평균 점수는 " + avg +"이며, 등급은 B입니다.");
		}
		else if(avg >= 70) {
			System.out.println("평균 점수는 " + avg +"이며, 등급은 C입니다.");
		}
		else if(avg >= 60) {
			System.out.println("평균 점수는 " + avg +"이며, 등급은 D입니다.");
		}
		else {
			System.out.println("평균 점수는 " + avg +"이며, 등급은 F입니다.");
		}
	}

}
