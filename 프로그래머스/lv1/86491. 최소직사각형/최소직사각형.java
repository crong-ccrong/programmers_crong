class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        // 긴 길이, 짧은 길이 순서로 정렬
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0]<sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (width < sizes[i][0]) {
                width = sizes[i][0];
            }
            if (height < sizes[i][1]) {
                height = sizes[i][1];
            }
        }
        
        int answer = width*height;
        return answer;
    }
}