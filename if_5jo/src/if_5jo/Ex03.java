package if_5jo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		double avg;
		System.out.print("국어 영어 수학 점수를 입력하시오 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		avg = kor + eng + mat / 3.0;
		if(avg < 60) {
			System.out.println("[평균 미달 불합격]");
		}
		else {
			if(kor >= 60 && eng >= 60 && mat >= 60) {
				System.out.println("[합격]");
			}
			else {
				System.out.println("[과락으로 불합격]");
			}
		}
		
	}

}
