package programmers_lv1;

public class P2 {
	public static void main(String[] args) {
		P2.solution(10, 10);
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = x; // �Է��� -10000000 ���� ������ �����ؼ�, long���� ����������. int�δ� ������ �������
            for(int i=0;i<n;i++, plus+=x) {
                answer[i]=plus;
            }
        return answer;
    }
}
