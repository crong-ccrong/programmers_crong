import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer="";
        
        for(int i=0; i<a.length(); i++) {
            char b = a.charAt(i);
            if(Character.isUpperCase(b)) {
                answer += Character.toLowerCase(b);
            } else {
                answer += Character.toUpperCase(b);
            }
        }
     System.out.println(answer);   
    }    
}