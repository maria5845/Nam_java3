package nam_d3;


public class arrQuiz3 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 4, 7 };
		int s = 0;
		int b = 0;

// ��ġ ���� ������ S 
// ��ġ ���� �ٸ��� B
		/*
		 * if (arr1[0] == arr2[0]) { s++; } 
		 * else { b++; }
		 *  if (arr1[1] == arr2[1]) { s++;		 * } 
		 *  else { b++; } 
		 *  if (arr1[2] == arr2[2]) { s++; } else { b++; }
		 * System.out.println("��Ʈ����ũ"+s); System.out.println("��"+b);
		 * 
		 */
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if(i==j) {
						s++;
					}else {
						b++;
					}
				}
			
			}
		}
		System.out.println("��Ʈ����ũ:"+s);
		System.out.println("��:"+b);
	}
}
