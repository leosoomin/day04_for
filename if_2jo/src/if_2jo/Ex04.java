package if_2jo;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;	// 현재 년도
		int age;	// 나이
		int birth;	// 태어난 년도
		int w;
		System.out.print("현재 년도를 입력하시오 : ");
		year = sc.nextInt();
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		
		birth = year - age + 1;
		w = birth - birth % 10;
		System.out.println(w+"년대에 태어났습니다.");
		

	}

}
