package if_day03;

public class Ex06 {

	public static void main(String[] args) {
		// 중첩 if문
		int n1 = 30, n2 = 10, n3 = 20;
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("n1이 가장 크다");
			} else {
				System.out.println("n3가 가장 크다");
			}
		}
		else {
			if(n2 > n3) {
				System.out.println("n2가 가장 크다");
			}else {
				System.out.println("n3가 가장 크다");
			}
		}
	}

}
