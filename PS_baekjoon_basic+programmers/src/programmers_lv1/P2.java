package programmers_lv1;

public class P2 {
	public static void main(String[] args) {
		P2.solution(10, 10);
	}
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = x; // 입력이 -10000000 정도 까지도 가능해서, long으로 선언해주자. int로는 문제가 생기더라
            for(int i=0;i<n;i++, plus+=x) {
                answer[i]=plus;
            }
        return answer;
    }
}
