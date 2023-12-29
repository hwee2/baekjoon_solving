package Bronze5.Day3;

import java.util.Scanner;

public class B9086_다른답안1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++) {
            String word = sc.next();
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
        }
    }
}
