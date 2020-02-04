package nam_d3;

import java.util.Scanner;

public class arrQuiz4 {
	public static void main(String[] args) {
		boolean check = true;
		int cnt = 0;
		while (check) {
			int[] arr1 = { 1, 2, 3 };// new int[3];
			int[] arr2 = new int[3];

			int s = 0;
			int b = 0;
			

			System.out.println("숫자를 입력하시오[3자리 입력해주세요]");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();

// num1을 각자리를 쪼개서 arr2에 저장한다 
			
			arr2[0] = num1 % 1000 / 100;
			arr2[1] = num1 % 100 / 10;
			arr2[2] = num1 % 10;

			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						if (i == j) {
							s++;
						} else if(i!=j)  {
							
						} else {
							b++;
						} 
					
					}

				}
			}
			System.out.println("S" + s +"B"+b);
			if (s != 3) {
				System.out.println("다시 숫자 3개를 던져주세요");
				cnt++;

			} else if (cnt == 0) {
				System.out.println("한방 맞췄습니다.");
				check = false;
			}else {
				cnt++;
				System.out.println(cnt+"번 만에 맞추었습니다.");
			check = false;
			}
		}
	}
}