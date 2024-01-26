import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
		Map<String, Integer> map = new HashMap<>();

		// 고정된 값 9개를 미리 map에 담아둠
		for (int i = 0; i < 9; i++) {
			map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
		}

		// 슬라이딩 윈도우
		for (int i = 9; i < discount.length; i++) {
			map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
			boolean b = true;
			for (int j = 0; j < want.length; j++) {
				if (!map.containsKey(want[j]) || map.get(want[j]) != number[j]) {
					b = false;
				}
			}
			if (b) {
				answer++;
			}
			map.put(discount[i - 9], map.get(discount[i - 9]) - 1);
		}
        return answer;
    }
}