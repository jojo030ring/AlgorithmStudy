package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2_숫자카드게임 {
	/**
	 * 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임.
	 * <게임의 룰>
	 * 1. 카드 : NxM의 형태로 놓여있음. N : 행 / M : 열
	 * 2. 뽑고자 하는 카드가 포함된 행 선택
	 * 3. 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 것을 선택
	 * 4. 이후 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려, 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 해야함.
	 * 
	 * 3 1 2
	 * 4 1 4
	 * 2 2 2
	 * 
	 * 1번째 행 : 1
	 * 2번째 행 : 1
	 * 3번째 행 : 2
	 * 3번째 행을 뽑아야 한다.
	 * 
	 * 입력 : 행의 개수 N 열의 개수 M 공백 기준으로 하여 나뉨
	 * 둘째 줄부터 N개의 줄에 걸쳐 카드에 적힌 숫자 주어짐.
	 * 
	 * 3 3
	 * 3 1 2
	 * 4 1 4
	 * 2 2 2
	 * 
	 * 2 4
	 * 7 3 1 8
	 * 3 3 3 4
	 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		// 초기화 과정
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 최소값을 저장하는 ArrayList minList
		ArrayList<Integer> minList = new ArrayList<Integer>();
		// 입력이 1부터 10000까지여서 충분히 큰 값을 지정해주었다.
		int min = 10001;
		// arr를 순회하며 min값을 찾는다.
		for(int i=0;i<n;i++) {
			// i열 내의 최소값을 찾는 과정
			for(int j=0;j<m;j++) {
				if(arr[i][j] <min) {
					min = arr[i][j];
				}
			}
			// for문을 빠져나왓을 때는 i열에 대한 최소값이 등장한 상태
			minList.add(min);
		}
		// sorting > 오름차순
		Collections.sort(minList);
		bw.write(minList.size()-1+"");
		bw.close();
		br.close();
		
		
		
		
	}
	
	
	
	
}
