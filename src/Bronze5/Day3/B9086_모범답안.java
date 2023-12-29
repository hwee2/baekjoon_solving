package Bronze5.Day3;

import java.util.Scanner;

public class B9086_모범답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i = 0 ; i < T ; i++) {
            String word = sc.next();
            String result = word.substring(0,1) + word.substring(word.length()-1);
            System.out.println(result);
        }
    }
}
