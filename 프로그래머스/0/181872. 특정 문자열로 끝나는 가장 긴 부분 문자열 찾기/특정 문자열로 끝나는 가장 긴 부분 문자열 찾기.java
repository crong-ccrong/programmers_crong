class Solution {
    public String solution(String myString, String pat) {
        for (int i=myString.length()-1; i>-1; i--) {
            myString = myString.substring(0, i+1);
            if (myString.endsWith(pat)) {
                break;
            }
        }
        return myString;
    }
}