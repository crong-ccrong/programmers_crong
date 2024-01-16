import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekNumber = dayOfWeek.getValue();
		String answer = (dayOfWeekNumber==1) ? "MON" : (dayOfWeekNumber==2) ? "TUE" : (dayOfWeekNumber==3) ? "WED" : (dayOfWeekNumber==4) ? "THU" : (dayOfWeekNumber==5) ? "FRI" : (dayOfWeekNumber==6) ? "SAT" : "SUN";
        return answer;
    }
}