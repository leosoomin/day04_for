package Quiz_5jo;

public class Ex02 {

	public static void main(String[] args) {
		int a;	// 백의자리
		int b;	// 십의자리
		int c;	// 일의자리
	    for(int i = 100; i <= 500; i++) {
	    	a = i / 100;			// 백의자리
	    	b = (i % 100) / 10;		// 십의자리
	    	c = i % 10;				// 일의자리
	    	if( (a*a*a) + (b*b*b) + (c*c*c) == i ) {
	    		System.out.println("수 : " + i);
	    	}
	    }

	}

}
