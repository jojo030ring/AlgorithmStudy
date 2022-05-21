package ch4_list;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class P1406 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine(); // 첫 문자열을 입력받음
		int n = Integer.parseInt(br.readLine());	// 명령어를 몇 번 반복할 것인지 입력받음
		String input= "";	// 명령어를 받을 문자열
		
		LinkedList<String> list =addElems(str); // LinkedList 선언
		ListIterator<String> liter = list.listIterator(); // DoubleLinkedList가 없어서 ListIterator를 받아온다.
		
		/**
		 * 커서의 개념이므로, listIterator를 끝까지 보내준다.
		 */
		while(liter.hasNext()) {
			liter.nextIndex();
			
			liter.next();
			
		}

		
		for(int i=0;i<n;i++) {
			input = br.readLine(); // 명령을 입력받음
			StringTokenizer st= new StringTokenizer(input, " "); // 공백 기준으로 토큰을 분리
			String command = st.nextToken(); // 무조건 첫 글자는 command이므로 이것만 먼저 분리
			switch(command) {
			/**
			 * 커서를 왼 쪽으로 한 칸 옮김
			 * 커서가 문장의 맨 앞이면 무시됨
			 */
				case "L":	
					if(liter.hasPrevious()) {
						liter.previous();
					}
					
					break;
			/**
			 * 커서 오른쪽으로 한 칸 옮김(문장의 맨 뒤면 무시됨) 
			 */
				case "D":
					if(liter.hasNext()) {
						liter.next();
					}
					break;
			/**
			 * 커서 왼쪽에 있는 문자 삭제(커서가 문장의 맨 앞이면 무시)
			 * 삭제로 인해 커서는 한 칸 왼쪽으로 옮겨간 것처럼 나타나나,
			 * 실제로 커서의 오른쪽에 있던 문자는 그대로.
			 */
				case "B":
					if(liter.hasPrevious()) {
						liter.previous(); // 마지막으로 읽어온 값을 삭제하므로 이를 꼭 해주어야 한다
						liter.remove();
					}
					break;
				case "P":
				/**
				 * 문자를 커서 왼쪽에 추가
				 */
					
					 String putItem = st.nextToken();
					 liter.add(putItem); // add는 그냥 추가해도 상관 없음. next나 previous가 필요 없음
					 break;
			}
			
		}
		
		for(String result : list) {
			bw.write(result);
		}
		bw.close();
		br.close();
		
		
	}
	
	public static LinkedList<String> addElems( String str) {
		LinkedList<String> ll = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			ll.add(str.charAt(i)+"");
		}
		return ll;
		
	}
}
