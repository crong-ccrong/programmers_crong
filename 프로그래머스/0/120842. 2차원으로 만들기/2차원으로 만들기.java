class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[(int) num_list.length/n][n];
        int index = 0;
        for (int i=0; i<num_list.length/n; i++) {
            int j = 0;
            while (j<n) {
                answer[i][j] = num_list[index];
                j++;
                index++;
            }
        }
        return answer;
    }
}