package Bronze5.Day3;

import java.util.Scanner;

public class B2744_다른답안1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i = 0; i< a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
