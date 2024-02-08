package Quiz_7jo;

public class Ex01 {

	public static void main(String[] args) {
		int Psum = 0, Hsum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				Psum += i;
			}
			else {
				Hsum += i;
			}
		}
		System.out.println("1부터 100까지의 짝수 합을 구하시오 : " + Psum);
		System.out.println("1부터 100까지의 홀수 합을 구하시오 : " + Hsum);

	}

}
