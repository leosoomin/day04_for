package if_day03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("세 수를 입력하시오 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2 ) {
			if(n1 > n3 && n2 > n3) {
				System.out.println("가장 큰 수 : n1, 두번 째 큰 수 : n2, 제일 작은 수 : n3");
			}
			if(n1 > n3 && n2 < n3) {
				System.out.println("가장 큰 수 : n1, 두번 째 큰 수 : n3, 제일 작은 수 : n2");
			}
			if(n1 < n3) {
				System.out.println("가장 큰 수 : n3, 두번 째 큰 수 : n1, 제일 작은 수 : n2");
			}
		}else {
				if(n2 > n3 && n1 > n3) {
					System.out.println("가장 큰 수 : n2, 두번 째 큰 수 : n1, 제일 작은 수 : n3");
				}
				if(n2 > n3 && n1 < n3) {
					System.out.println("가장 큰 수 : n2, 두번 째 큰 수 : n3, 제일 작은 수 : n1");
				}
				if(n2 < n3) {
					System.out.println("가장 큰 수 : n3, 두번 째 큰 수 : n2, 제일 작은 수 : n1");
				}
			}
		System.out.println("숫자 비교 끝");

	}
}
