package if_7jo;

public class Ex03 {
	public static void main(String[] args) {
		  String ezinsu1 = "00001111";
	      String ezinsu2 = "00000011";
	      String ezinsu3 = "00010011";
	      String ezinsu4 = "00011100";	        

	      // Integer.parseInt(a,2); --> 문자열 2진수를 정수로 형 변환시키는 코드
	        int num1 = Integer.parseInt(ezinsu1, 2);
	        int num2 = Integer.parseInt(ezinsu2, 2);
	        int num3 = Integer.parseInt(ezinsu3, 2);
	        int num4 = Integer.parseInt(ezinsu4, 2);
	        	        
	        System.out.println("형변환한 2진수: " + num1);
	        System.out.println("형변환한 2진수: " + num2);
	        System.out.println("형변환한 2진수: " + num3);
	        System.out.println("형변환한 2진수: " + num4);
	       
	        int result1 = num1 & num2;
	        int result2 = num3 | num4;
	        
	        System.out.println(result1);
	        System.out.println(result2);	        
	        
	        if (result1 > result2) {
	            System.out.println(result1 + "은 큰 수입니다.");
	            System.out.println(result2 + "은 작은 수입니다.");
	        } else if (result1 < result2) {
	            System.out.println(result2 + "은 큰 수입니다.");
	            System.out.println(result1 + "은 작은 수입니다.");
	        } else {
	            System.out.println("두 수가 같습니다.");
	        }
	        System.out.println();
	        System.out.println("축하합니다!!");
	}
}
