package programmers_lv1;

import java.util.*;
class Solution {
	public static void main(String[] args) {
		Solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, 
				new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2); 
				
	}
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 한번에 한 명만 신고 가능
        // k 번 이상 신고된 유저는 이용이 정지되고, 신고한 유저들에게 모두 메일이 발송됨.
        // 마지막에 신고 취합하면서 이용정지를 시키고 메일로 발송함
        
        // id_list : 이용자 아이디가 담긴 문자열 배열
        // report : 이용자 아이디정보가 담긴 문자열 배열
        // k : 정지 기준이 되는 신고 횟수
        StringTokenizer st = null;
        LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();
        int[] reportedSize = new int[id_list.length];
        for(int i=0;i<id_list.length;i++) {
        	map.put(id_list[i], new HashSet<String>());
        	idxMap.put(id_list[i], i); // 이게 없으면 나중에 찾아가질 못함.
        }
        for(int i=0;i<report.length;i++) {
        	st = new StringTokenizer(report[i], " ");
        	String reporter = st.nextToken();
        	String reportee = st.nextToken();
        	HashSet<String> tmpHs = map.get(reporter);
        	tmpHs.add(reportee);
        	map.put(reporter, tmpHs);
        }
        for (int i=0;i<id_list.length;i++) {
        	HashSet<String> tmpHs = map.get(id_list[i]);
        	
        }
        
        
        return answer;
        
    }
    
}