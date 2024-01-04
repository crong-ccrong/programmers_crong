class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int index = 0;
        int[] arr = new int[ingredient.length];
        
        for (int i : ingredient) {
            arr[index] = i;
            index++;
            if (index>=4) {
                if(arr[index-4] == 1 && arr[index-3] == 2 && arr[index-2] == 3 && arr[index-1] == 1) {
                    index -= 4;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}