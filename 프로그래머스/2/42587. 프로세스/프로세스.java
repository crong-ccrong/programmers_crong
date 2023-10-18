import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 내림차순형 우선순위 큐에 priorities 담기
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : priorities) {
            queue.add(i);
        }
        
        // 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣기
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (!queue.isEmpty() && priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}