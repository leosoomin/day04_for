package if_day03;

public class Ex07 {

	public static void main(String[] args) {
		int num = 100;
		if(num >= 0) {
			if(num < 100) {
				System.out.println("num은 100보다 작은 양수");
			}
			else {
				System.out.println("num은 100보다 크다");
			}
		}else {
			System.out.println("num은 음수입니다.");
		}
		System.out.println("다음 문장들 실행!!!");
	}

}