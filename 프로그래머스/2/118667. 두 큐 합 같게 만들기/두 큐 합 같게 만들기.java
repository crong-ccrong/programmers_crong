import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        long sum1 = 0;
        long sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        // int[]를 Queue형으로 변환
        for (int i : queue1) {
            q1.add(i);
            sum1 += i;
        }
        for (int i : queue2) {
            q2.add(i);
            sum2 += i;
        }
        
        if ((sum1+sum2)%2 == 1) {
            return -1;
        } else {
            answer = 0;
            
            // 큐 합이 큰 쪽에서 poll, 큐 합이 작은 쪽에서 add
            while (sum1 != sum2) {
                if (answer < (queue1.length+queue2.length)*2) {
                    int temp = 0;
                    if (sum1 > sum2) {
                        temp = q1.poll();
                        q2.add(temp);
                        sum1 -= temp;
                        sum2 += temp;
                    } else {
                        temp = q2.poll();
                        q1.add(temp);
                        sum1 += temp;
                        sum2 -= temp;
                    }
                    answer++;
                } else {
                    return -1;
                }
        }
        return answer;
        }
    }
}
