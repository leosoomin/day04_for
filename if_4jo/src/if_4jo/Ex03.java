package if_4jo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 내가 쓴 코드
		Scanner sc = new Scanner(System.in);
		String a, b;
		System.out.print("첫 번째 사람 가위 바위 보 입력 : ");
		a = sc.next();
		System.out.print("두 번째 사람 가위 바위 보 입력 : ");
		b = sc.next();
		if( ("가위".equals(a) || "바위".equals(a) || "보".equals(a)) 
				&& ("가위".equals(b) || "바위".equals(b) || "보".equals(b)) ) {
			if(a.equals(b)) {
				System.out.println("무승부");
			}
			
			else if("바위".equals(a)) {
				if("가위".equals(b)) {
					System.out.println("첫 번째 사람 승");
				}
				else {
					System.out.println("두 번째 사람 승");
				}
			}
			
			else if("가위".equals(a)) {
				if("보".equals(b)) {
					System.out.println("첫 번째 사람 승");
				}
				else {
					System.out.println("두 번째 사람 승");
				}
			}
			
			else if("보".equals(a)) {
				if("바위".equals(b)) {
					System.out.println("첫 번째 사람 승");
				}
				else {
					System.out.println("두 번째 사람 승");
				}
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
}
	
