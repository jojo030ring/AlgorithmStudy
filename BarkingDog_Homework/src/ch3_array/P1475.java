package ch3_array;

import java.io.*;
public class P1475 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int[] arr = new int[10];
		// 0으로 다 초기화 시킨 뒤
		// 돌아가면서 더해주기
		// 6이랑 9 처리만 해주면 되는데,
		// 인덱스의 요소 개수를 2로 나눈 뒤 나누어 떨어지면 몫 만큼의
		// 나누어 떨어지지 않으면 몫 + 1만큼의 세트 개수가 필요하다.
		int setNum = 0; // 6, 9 제외한 개수를 통해 
		int replaceCanNum = 0; // 6과 9의 개수를 담을 변수
		// 순회하면서 각 자리 수를 기록
		for(int i=0;i<input.length();i++) {
			int index = input.charAt(i)-'0';
			arr[index]++;
		}
		// arr를 순회하면서 set 개수를 구함.
		for(int i=0;i<10;i++) {
			if(arr[i]>setNum && (i!= 6 && i!=9)) { // i가 6이고 9인 경우는 따로 생각하기로 함
				setNum = arr[i];  // arr[i]가 setNum보다 크면 setNum에 arr[i]를 넣는다.
			}
		}
		int tmp = arr[6] + arr[9]; // 6과 9는 대체 가능하기 때문에 따로 계산해준다.
		replaceCanNum = (tmp%2 == 0) ?  tmp/2 : (tmp/2+1);
		// 나머지가 없는 경우는 2로 나눈 몫이지만, 나머지가 있는 경우는 1을 더해주어야 한다.
		
		setNum = Math.max(setNum, replaceCanNum);
		// 따로 구해준 9과 6의 개수와 setNum의 최대값을 setNum에 대입해준다.
		bw.write(setNum+"");
		bw.close();
		br.close();
			
		
	}
	
	
}
