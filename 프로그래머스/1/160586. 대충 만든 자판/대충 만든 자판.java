import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int count = 0;
        
        // keymap을 하나로 통합하기
		Map<Character, Integer> map = new HashMap<>();

		for (String s : keymap) {
			int idx = 1;
			for (char a : s.toCharArray()) {
				map.put(a, map.getOrDefault(a, idx));
				if (map.get(a) > idx) {
					map.put(a, idx);
				}
				idx++;
			}
		}

		// 타겟 계산
		int idx = 0;
		for (String s : targets) {
			for (char a : s.toCharArray()) {
				if (map.keySet().contains(a)) {
					count += map.get(a);
				} else {
					count = -1;
                    break;
				}
			}
			answer[idx] = count;
			++idx;
			count = 0;
		}
        
        return answer;
    }
}