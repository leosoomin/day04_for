package beakjoon;

import java.util.Scanner;

public class B2753 {
	// 4의 배수이면서 100의배수면 0
	// 4의 배수이면서 400의 배수면 1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("수 입력 : ");
		a = sc.nextInt();
		if(a % 4 == 0) {
			if(a % 100 == 0 && a % 400 != 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else {
			System.out.println(0);
		}
		
	}

}

