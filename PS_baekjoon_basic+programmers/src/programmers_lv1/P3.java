package programmers_lv1;

public class P3 {
	public static void main(String[] args) {
		
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		// ����� ���� : ��� ���� �� �� ����.
		// ���� for������ �����ָ� ��.
	        for(int i=0;i<answer.length;i++) {
	            for(int j=0;j<answer[i].length;j++) {
	                answer[i][j] = arr1[i][j]+arr2[i][j];
	            }
	        }
	        
        return answer;
	    }
		
}
