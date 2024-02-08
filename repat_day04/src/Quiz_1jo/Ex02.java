package Quiz_1jo;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computerNum;
		int userNum;
		computerNum = (int)(Math.random()*100);
		// 0~100사이의 난수 1개 생성
		if(computerNum % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		while(true) {
			System.out.print("1~100 사이의 값을 입력하시오 : ");
			userNum = sc.nextInt();
			if(computerNum > userNum) {
				System.out.println("더 큰 수입니다.");
			}
			else if(computerNum < userNum) {
				System.out.println("더 작은 수입니다.");
			}
			else {
				System.out.println("맞췄습니다.");
				break;
			}
		}
	}

}
