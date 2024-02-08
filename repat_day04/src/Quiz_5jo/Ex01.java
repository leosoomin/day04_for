package Quiz_5jo;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int oddSum = 0;
		int i;
		for(i = 1; oddSum < 10000; i++) {
			if(i % 2 == 1) 
				oddSum += i;
		}
		i--;	// i값이 짝수이므로 마지막 홀수의 값은 i보다 1 작아야한다.
		System.out.println("마지막에 더해진 홀수 : " + i);
		System.out.println("마지막에 더해진 합 : " + oddSum);
	}

}
