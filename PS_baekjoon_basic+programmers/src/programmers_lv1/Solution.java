package programmers_lv1;

import java.util.*;
class Solution {
	public static void main(String[] args) {
		Solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, 
				new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2); 
				
	}
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // �ѹ��� �� �� �Ű� ����
        // k �� �̻� �Ű�� ������ �̿��� �����ǰ�, �Ű��� �����鿡�� ��� ������ �߼۵�.
        // �������� �Ű� �����ϸ鼭 �̿������� ��Ű�� ���Ϸ� �߼���
        
        // id_list : �̿��� ���̵� ��� ���ڿ� �迭
        // report : �̿��� ���̵������� ��� ���ڿ� �迭
        // k : ���� ������ �Ǵ� �Ű� Ƚ��
        StringTokenizer st = null;
        LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();
        int[] reportedSize = new int[id_list.length];
        for(int i=0;i<id_list.length;i++) {
        	map.put(id_list[i], new HashSet<String>());
        	idxMap.put(id_list[i], i); // �̰� ������ ���߿� ã�ư��� ����.
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