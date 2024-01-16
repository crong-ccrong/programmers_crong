import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
    }
}