class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int t = 0; // 시간
        int combo = 0; // 붕대 감기 스킬 연속 성공
        int current = health; // 현재 체력
        int hit = 0; // 몬스터의 공격 순서
        
        while (t<attacks[attacks.length-1][0]) {
            t++;
            
            if (attacks[hit][0] == t) { // 공격 당함
                current -= attacks[hit][1];
                hit++;
                combo = 0;
            } else { // 붕대 감기 스킬 사용
                current += bandage[1];
                combo++;
                if (combo == bandage[0]) {
                    current += bandage[2];
                    combo = 0;
                }
                if (current > health) { // 현재 체력이 최대 체력
                    current = health;
                }
            }
            
            // 체력이 0 이하
            if (current <= 0) {
                return -1;
            }
        }
        return current;
    }
}