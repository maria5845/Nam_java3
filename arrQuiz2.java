package nam_d3;

public class arrQuiz2 {
	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 4, 3 };
		int cnt = 0;
//arr1[0]引 arr2[0],arr1[0]引 arr2[1],arr1[0] 引 arr2[2] 
//arr1[1]引 arr2[0],arr1[1]引 arr2[1],arr1[1] 引 arr2[2] 
//arr1[2]引 arr2[0],arr1[2]引 arr2[1],arr1[2] 引 arr2[2] 

		for (int i =0 ; i <3; i++) {
			for (int j =0 ; j < 3; j++) {
				if (arr1[i] == arr2[j]) {
					cnt++;
				} 
				
			}
		
		}
		System.out.println("姐呪:"+cnt);
	}
}
