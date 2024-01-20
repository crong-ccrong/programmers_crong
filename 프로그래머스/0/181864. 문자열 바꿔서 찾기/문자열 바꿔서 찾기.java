class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "C").replace("B", "A").replace("C", "B");
        return (myString.contains(pat)) ? 1 : 0;
    }
}