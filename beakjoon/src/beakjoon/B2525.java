package beakjoon;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H,M;
		int duration;
		System.out.print("현재 시와 분 걸리는 시간 작성 : ");
		H = sc.nextInt();
		M = sc.nextInt();
		duration = sc.nextInt();
		
		int Hour = M + duration / 60;
		int Minute = M + duration % 60;
		
		if (H + Hour > 23) {
			H -=24;
			if(M + Minute > 60) {
			M -=60;
			System.out.println(H + "시" + M + "분");
			} 	else {
					System.out.println(H + "시" + M + "분");
					}					
		}else {
			if(M + Minute > 60) {
				M -=60;
				System.out.println(H + "시" + M + "분");
				} 	else {
						System.out.println(H + "시" + M + "분");
						}			
			System.out.println(H + "시" + M + "분");
		}
	}
}
