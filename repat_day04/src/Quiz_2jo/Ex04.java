package Quiz_2jo;

import java.util.Scanner;

public class Ex04 {
	
// 이 문제 다시 풀어보기!!!!!!!!!! 중요
	
	public static void main(String[] args) {
		/*
		// int : 4byte = 2의 32승
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
		System.out.println("숫자를 입력하시오 : ");
		num = sc.nextInt();
		if(num / 10 == 0) {			// 한 자리 수
			System.out.println("출력 : " + num);
		}
		else if(num / 100 == 0) {	// 두 자리 수
			System.out.println("출력 : " + num / 10 + num % 10);
		}
		else if(num / 1000 == 0) {	// 세 자리 수
			System.out.println("출력 : " + num / 100 + (num % 100) / 10 + num % 10);
		} 내 다가리에 한계인가보다
		
		}
		*/
		
		int num;
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			num = s.nextInt();
			
			int sum = 0;
			int temp = num;
			
			
			if(num == 0)
				break;
			while(true)
			{
				int ten = 10;
				
				if(temp > 0)
				{
					sum += temp % ten; 
					temp -= temp % ten; 
					temp = temp / 10;	
					// 반복문 돌려서 끝에 자리수 구하는 코드 --> 이렇게 나온 숫자를 더하면
					// 숫자의 각 자리수의 합이 나온다.
				}
				else
				{
					break;
				}
			}
			
			System.out.println(sum);
		}
			
	}

}
