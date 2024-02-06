import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split(""))
                    .sorted()
                    .reduce("", (str1, str2) -> str1+str2);
    }
}