package switch_day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home = "0";
		String company = "0";
		int select;
		
		while(true) {
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록 보기");
		select = sc.nextInt();
		
		switch (select) {
		case 1 : System.out.print("1.우리집 목적지 입력 : ");
		home = sc.next(); 
		System.out.println("등록 성공"); break;
		case 2 : System.out.println("2.회사 목적지 입력 : ");
		company = sc.next();
		System.out.println("등록 성공"); break;
		case 3 : System.out.println("1.우리집 : " + home);
		System.out.println("2.회사 : " + company); break;
		}
		}
		
	}
}
