import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for (int i=0; i<progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            queue.add(count);
            count = 0;
        }
        while (!queue.isEmpty()) {
            List<Integer> size = new ArrayList<>();
            size.add(queue.poll());
            while (queue.peek() != null && size.get(0) >= queue.peek()) {
                size.add(queue.poll());
            }
            answer.add(size.size());
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}