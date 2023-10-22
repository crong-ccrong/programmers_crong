import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        // 차량번호 작은 순으로 나열
		ArrayList<String> listNumber = new ArrayList<>();
		for (String str : records) {
			String[] split = str.split(" ");
			listNumber.add(split[1]);
		}
		HashSet<String> setNumber = new HashSet(listNumber);
		ArrayList<String> targetNumber = new ArrayList<String>(setNumber);
		Collections.sort(targetNumber);

		// 답
		ArrayList<Integer> answerList = new ArrayList<>();
		int[] answer = new int[targetNumber.size()];

		// 차량별 입출입 시간(분 기준)
		for (String target : targetNumber) {
			ArrayList<Integer> targetTime = new ArrayList<>();
			for (String str : records) {
				String[] split = str.split(" ");
				String[] hour = split[0].split(":");
				if (split[1].equals(target)) {
					targetTime.add(Integer.parseInt(hour[0]) * 60 + Integer.parseInt(hour[1]));
				}
			}

			// 차량별 총 이용 시간
			int fee = 0;
			int totalTime = 0;
			for (int i = 1; i <= targetTime.size(); i = i + 2) {
				if (i >= targetTime.size()) {
					totalTime += (24 * 60 - 1) - targetTime.get(i - 1);
				} else {
					totalTime += targetTime.get(i) - targetTime.get(i - 1);
				}
			}

			// 차량별 주차 요금
			int totalFee = 0;
			if (totalTime <= fees[0]) {
				totalFee += fees[1];
			} else {
				if ((totalTime - fees[0]) % fees[2] != 0) {
					totalFee += ((totalTime - fees[0]) / fees[2] + 1) * fees[3] + fees[1];
				} else {
					totalFee += ((totalTime - fees[0]) / fees[2]) * fees[3] + fees[1];
				}

			}
			answerList.add(totalFee);
		}
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
        return answer;
    }
}