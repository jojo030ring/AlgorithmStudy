package chapter4;
/*
 * 	�־��� ���� N�� int �迭 arr���� ���� 100�� ���� �ٸ� ��ġ�� �� ���Ұ�
 * �����ϸ� 1, �������� ������ 0�� ��ȯ�ϴ� func2(int arr[], int n)�� 
 * �ۼ��϶�.
 * �� ���� 0�̻� 100����, N�� 1000���ϴ�.
 * 
 * func2({1,52,48},3) = 1
 * func2({50,42},2) = 0
 * func2({4,13,63,87},4) = 1
 * 
 * */
public class Ex2 {
	public static void main(String[] args) {
		System.out.println(func2(new int[] {4,13,63,87},4));
	}
	
	public static int func2(int[] arr, int n) {
		int [] check = new int[101];
		check[0] = 999;
		for(int i=0;i<arr.length;i++) {
			check[arr[i]]=1;
			if(check[100-arr[i]]!=0)
				return 1;
		}
		return 0;
		
	}
}
