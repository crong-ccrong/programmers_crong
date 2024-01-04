class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length() - my_string.replace(" ", "").length()+1];
        int index = 0;
        for (String s : my_string.split(" ")) {
			answer[index] = s;
            index++;
		}
        return answer;
    }
}