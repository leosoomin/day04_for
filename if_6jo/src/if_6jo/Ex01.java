package if_6jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("1~6사이의 숫자 3개 뽑기 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b) {
			if(a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				System.out.println(1000 + a * 100);
			}
		}
		
		else if(a == c) {
			if(b == c) {
				System.out.println(10000 + c * 1000);
			}
			else {
				System.out.println(1000 + c * 100);
			}
		}
		
		else if(b == c) {
			if(a == c) {
				System.out.println(10000 + b * 1000);
			}
			else {
				System.out.println(1000 + b * 100);
			}
		}
		else {
			if(a > b && a > c) {
				System.out.println(a * 100);
			}
			else if(a > b && a < c ) {
				System.out.println(c * 100);
			}
			else if(a < b && b < c ) {
				System.out.println(c * 100);
			}
			else if(a < b && b > c ) {
				System.out.println(b * 100);
			}
		}				
	}
}