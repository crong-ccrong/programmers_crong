class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        for (int[] arr : queries) {
            String temp = new StringBuffer(sb.substring(arr[0], arr[1]+1)).reverse().toString();
            sb.replace(arr[0], arr[1]+1, temp);
        }
        return sb.toString();
    }
}