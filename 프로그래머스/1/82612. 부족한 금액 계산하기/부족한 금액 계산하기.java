class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        
        while (count != 0) {
            total += count*price;
            count--;
        }
        
        return (total>money) ? total-money : 0;
    }
}