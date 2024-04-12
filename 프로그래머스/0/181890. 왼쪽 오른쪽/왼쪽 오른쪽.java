import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            switch (str_list[i]) {
                case "l":
                    return Arrays.copyOfRange(str_list, 0, i);
                case "r":
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[0];
    }
}