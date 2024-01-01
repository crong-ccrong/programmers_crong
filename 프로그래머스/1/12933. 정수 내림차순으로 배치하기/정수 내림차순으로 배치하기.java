import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String str = n+"";
        String[] arr = new String[str.length()];
        
        for (int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i)+"";
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (String s : arr) {
            answer += s;
        }
        return Long.parseLong(answer);
    }
}