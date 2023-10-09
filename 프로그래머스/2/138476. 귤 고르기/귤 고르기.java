import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int count = 0;
		int answer = 0;

		// map에 담아서 크기별 개수 구하기
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < tangerine.length; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
		}

		// list에 담아서 개수별 정렬하기
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list, Collections.reverseOrder());

		// 큰 개수별로 담아서 k 보다 커질 때 구하기
		for (int i = 0; i < list.size(); i++) {
			if (count >= k) {
				break;
			}
			count += list.get(i);
			answer++;
		}
		return answer;
    }
}