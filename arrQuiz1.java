package nam_d3;
// 두배열이 같은지 출력하는 코드 
public class arrQuiz1 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		boolean tmp = ((arr1[0]==arr2[0]) && (arr1[1]==arr2[1]) && (arr1[2]==arr2[2]));

		if (tmp) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}