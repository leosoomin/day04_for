package if_2jo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int year;
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		if(year <= 0) {
			System.out.println("1~4000사이를 입력하시오.");
		}
		else {
			if(year % 4 == 0) {
				if(year % 100 == 0 && year % 400 != 0 ) {
					System.out.println(0);
				}
				else {
					System.out.println(1);
				}
			}
			else {
				System.out.println(0);
			}
		}
	}

}
