package Quiz_5jo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; 	// 각 반 학생수
		int kor;
		int sum = 0;
		double avg = 0.0;
		System.out.print("총 학생 수 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i + "번 학생 국어 성적 : ");
			kor = sc.nextInt();
			if(kor <= 0 && kor > 0) {
				sum += kor;
			}
			else {
				System.out.println(i + "번 학생 다시 입력해주세요 : ");
			}
			avg = sum / (double)num;
		}
		System.out.println("총 점 : " + sum);
		System.out.println("총 평균 : " + avg);
		
	}

}
