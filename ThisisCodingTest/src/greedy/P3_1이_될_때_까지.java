package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3_1��_��_��_���� {
	/**
	 * � �� N�� 1�� �� �� ���� ������ �� ������ �ϳ��� �ݺ������� �����Ͽ� �����Ѵ�.
	 * �� ��° ������ N�� K�� ��������� ���� ����Ѵ�.
	 * 1. N���� 1�� ����
	 * 2. N�� K�� ������.
	 * 
	 * N = 17 / K = 4 �϶�,
	 * N%4!=0�̹Ƿ� K-1 = 16 : 1ȸ
	 * N = 16, N%K = 0�̹Ƿ� N/4 = 4 : 2ȸ
	 * N%K =0 �̹Ƿ� N/4 = 1 : 3ȸ
	 * 
	 * N�� K�� �־��� �� N�� 1�� �� ������ 1�� Ȥ�� 2�� ������ �����ؾ��ϴ� �ּ� Ƚ���� ���ϴ� ���α׷��� �ۼ��϶�.
	 * 
	 * �Է� : ù °�ٿ� N(2<=N<=100000) K(2<=K<=100000)�� �������� ���еǰ� ���� �ڿ����� �־�����.
	 * �Է����� �־����� N�� �׻� K���� ũ�ų� ����.
	 * 
	 * �Է� ���� 
	 * 25 5
	 * 
	 * ��� ����
	 * 2
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		int remainder = 0;
		// �̿ϼ�
		bw.write(count+"");
		bw.close();
		br.close();
		
		
	}
}
