class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        for (int i=1; i<words.length; i++) {
            // 순서의 단어가 이전에 포함되어 있었는지 확인
            for (int j=0; j<i; j++) {
                if (words[j].equals(words[i])) {
                    answer[0] = i%n+1;
                    answer[1] = i/n+1;
                    return answer;
                    }
            }
            // 순서의 단어 첫 알파벳이 이전 순서의 단어 끝 알파벳과 같은지 확인
            if (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;
            }
        }
        return answer;
    }
}