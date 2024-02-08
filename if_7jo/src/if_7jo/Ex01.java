package if_7jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int dollar;
		int won;
		while(true) {	// while-true(무한루프) : break를 만나야 빠져나올 수 있다.
			System.out.println("환전하실 단위를 선택하세요(1-달러, 2-원화) : ");
			select = sc.nextInt();
			if(select == 1) {
				System.out.println("얼마를 환전하시겠습니까? ");
				dollar = sc.nextInt();
				System.out.println(dollar + "달러를 환전하시면 " + dollar*1326 + "원입니다.");
			break;  // 무한 루프를 빠져나온다.
			}
			else if(select == 2) {
				System.out.println("얼마를 환전하시겠습니까? ");
				won = sc.nextInt();
				System.out.println(won + "원을 환전하시면 " + won/1326 + "달러입니다.");
				break;  // 무한 루프를 빠져나온다.
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

}
