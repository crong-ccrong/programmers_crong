import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
		map.put("T", 0);
		map.put("C", 0);
		map.put("F", 0);
		map.put("J", 0);
		map.put("M", 0);
		map.put("A", 0);
		map.put("N", 0);
        
        // 질문 선택에 따른 계산
        for (int i = 0; i < choices.length; i++) {
			System.out.println(survey[i]+" :: "+choices[i]);
			switch (survey[i]) {
			case "RT":
				if (choices[i] > 4) {
					map.put("T", map.get("T") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("R", map.get("R") + 4-choices[i]);
				}
				break;
			case "TR":
				if (choices[i] > 4) {
					map.put("R", map.get("R") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("T", map.get("T") + 4-choices[i]);
				}
				break;
			case "CF":
				if (choices[i] > 4) {
					map.put("F", map.get("F") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("C", map.get("C") + 4-choices[i]);
				}
				break;
			case "FC":
				if (choices[i] > 4) {
					map.put("C", map.get("C") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("F", map.get("F") + 4-choices[i]);
				}
				break;
			case "JM":
				if (choices[i] > 4) {
					map.put("M", map.get("M") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("J", map.get("J") + 4-choices[i]);
				}
				break;
			case "MJ":
				if (choices[i] > 4) {
					map.put("J", map.get("J") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("M", map.get("M") + 4-choices[i]);
				}
				break;
			case "AN":
				if (choices[i] > 4) {
					map.put("N", map.get("N") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("A", map.get("A") + 4-choices[i]);
				}
				break;
			case "NA":
				if (choices[i] > 4) {
					map.put("A", map.get("A") + choices[i]-4);
				} else if (choices[i] < 4) {
					map.put("N", map.get("N") + 4-choices[i]);
				}
				break;
			}
		}
        
        // 성격 유형 계산
        answer += (map.get("R")>=map.get("T")) ? "R" : "T";
		answer += (map.get("C")>=map.get("F")) ? "C" : "F";
		answer += (map.get("J")>=map.get("M")) ? "J" : "M";
		answer += (map.get("A")>=map.get("N")) ? "A" : "N";
        
        return answer;
    }
}