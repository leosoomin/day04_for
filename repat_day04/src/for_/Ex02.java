package for_;

public class Ex02 {
/*
F11 : 디버깅 모드 시작
F6 : 한 줄씩 실행(메소드 건너뜀)
F7 : 한줄씩 실행(메소드로 이동)
F8 : 다음 브레이크 포인터로 이동
ctrl + F2 : 디버깅 종료
 */

	public static void main(String[] args) {
		int sum = 0;
		// sum = sum + i; i++;
		for(int i = 1 ; i <= 10000; i++ ) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum : " + sum);

	}

}
