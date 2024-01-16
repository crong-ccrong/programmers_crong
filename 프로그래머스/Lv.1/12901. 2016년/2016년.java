import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString().substring(0,3);
    }
}