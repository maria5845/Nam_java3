package nam_d3;
// �ι迭�� ������ ����ϴ� �ڵ� 
public class arrQuiz1 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		boolean tmp = ((arr1[0]==arr2[0]) && (arr1[1]==arr2[1]) && (arr1[2]==arr2[2]));

		if (tmp) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}

}