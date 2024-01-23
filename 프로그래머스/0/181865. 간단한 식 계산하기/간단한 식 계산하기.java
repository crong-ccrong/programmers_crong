class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        switch(arr[1]) {
            case "+" :
                return Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            case "-" :
                return Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            case "*" :
                return Integer.parseInt(arr[0])*Integer.parseInt(arr[2]);
        }
        return 0;
    }
}