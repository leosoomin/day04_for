package beakjoon;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H,M;
		System.out.println("시, 분 입력 : ");
		H = sc.nextInt();
		M = sc.nextInt();
		if(1 <= H && H <= 23)  {
			if(M >= 45) {
				System.out.print(H + "시 " + M +"분" );
			}else {
				H = H-1;
				M = M-45+60;
				System.out.println(H + "시 " + M +"분" );
			}
		}else {
			if(M >= 45) {
				System.out.println(H + "시 " + M +"분" );
			} else {
				H = H-1+24;
				M = M - 45 + 60;
			} System.out.println(H + "시 " + M +"분" );
		}
	}

}
