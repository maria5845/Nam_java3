package nam_d3;

import java.util.Arrays;
import java.util.Scanner;

public class arrQuiz5 {
	public static void main(String[] args) {

		int[] arr2 = new int[3];
	    int num1= 123;

// num1�� ���ڸ��� �ɰ��� arr2�� �����Ѵ� 
  		arr2[0] = num1%10;
		arr2[1] = num1%10;
		arr2[2] = num1%10;
		
		System.out.println(Arrays.toString(arr2));
}
	
}