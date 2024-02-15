import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> email = new HashMap<>();
		Set<String> set = new HashSet<>();
        
        // 중복 신고 삭제
		for (String s : report) {
			set.add(s);
		}

		// 신고 계산
		for (String s : set) {
			map.put(s.split(" ")[1], map.getOrDefault(s.split(" ")[1], 0) + 1);
		}
        
        // 신고 처리 결과 메일 발송
		for (String s : map.keySet()) {
			if (map.get(s) >= k) {
				for (String str : set) {
					if (str.contains(" " + s)) {
						email.put(str.split(" ")[0], email.getOrDefault(str.split(" ")[0], 0) + 1);
					}
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