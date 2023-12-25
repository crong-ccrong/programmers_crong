class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] str = s.split(" ");
        
        for (String a : str) {
            min = (min > Integer.parseInt(a)) ? Integer.parseInt(a) : min;
            max = (max < Integer.parseInt(a)) ? Integer.parseInt(a) : max;
        }
        
        return min + " " + max;
    }
}