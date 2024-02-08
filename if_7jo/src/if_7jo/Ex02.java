package if_7jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		// int a;
		//a = (age / 10) * 10; 
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		if((age / 10 == 1 ) || (age / 10 == 0) ) {
			System.out.print(age / 10 * 10 + "대(미성년자입니다.) ");
			System.out.println(20-age+"년 뒤에는 어른이 됩니다.");
		}
		else if(age / 10 >= 10) {
			System.out.println("100살 이상 존재하지 않습니다.");
		}
		else {
			System.out.println(age / 10 * 10 + "대 어른 입니다.");
		}
	}

}
