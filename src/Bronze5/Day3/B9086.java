package Bronze5.Day3;

import java.util.Scanner;

public class B9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++) {
            String word = sc.next();
            String result = String.valueOf(word.charAt(0)) + String.valueOf(word.charAt(word.length()-1));
            //char+char 하면 아스키 코드 때문에 int로 계산됨
            // "" 붙여주거나 string.valueof +  string.valueof 해줘야 함
            System.out.println(result);
        }
    }
}
