import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
		Map<String, List<String>> map = new HashMap<>();
		Map<String, Integer> email = new HashMap<>();
		Set<String> set = new HashSet<>();
        
        // 중복 신고 삭제
		for (String s : report) {
			set.add(s);
		}

		// 신고 계산 : 신고 당한 사람 | 신고한 사람 리스트
		for (String s : set) {
			map.computeIfAbsent(s.split(" ")[1], key -> new ArrayList<>()).add(s.split(" ")[0]);
		}
        
        // 신고 처리 결과 메일 발송
		for (String s : map.keySet()) {
			if (map.get(s).size() >= k) {
				for (String str : map.get(s)) {
					email.put(str, email.getOrDefault(str, 0) + 1);
				}
			}
		}
        
        // answer 배열에 답 담기
        for (String s : id_list) {
			for (int i = 0; i < answer.length; i++) {
				if (email.containsKey(s) && s.equals(id_list[i])) {
			        answer[i] = email.get(s);
				}
			}
		}
        
        return answer;
    }
}