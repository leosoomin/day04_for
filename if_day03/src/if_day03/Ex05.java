package if_day03;

public class Ex05 {

	public static void main(String[] args) {
		int num, su =10;
		/*
		num = 0;		// 지역 변수 초기화해줘야 함.
		if(su > 100) {
			num = 1234;
		}
		if(su <= 100) {
			num = 1;
		}
		 System.out.println(num);	// 7번쨰 줄 지역 변수 초기화 안시켜주면 오류난다.
		 */
		if(su > 100) {
			num = 1234;
		}
		else {
			num = 1;
		}
		System.out.println(num); 		// else를 사용해주면 num을 초기화시켜주지 않아도 오류가 안난다.
		
	}

}
