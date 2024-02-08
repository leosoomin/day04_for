package Quiz_7jo;

import java.util.Scanner;

public class Ex03 {
	// 틀려서 답지보고 했음..
	public static void main(String[] args) {
		 for(int i=0; i<5; i++) {
	            for(int j=0; j<5-i-1; j++) {
	                System.out.print(" ");
	            }
	            for(int k=0; k<=i; k++) {
	                System.out.print("*");
	            }
	            for(int k=0; k<i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
		 }
	           
	}

}
