package Bronze4.Day10;

import java.util.Scanner;

public class B5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        int T = 0;

        for(int i = 0; i < 4 ; i++) {
            int score1 = sc.nextInt();
            S += score1;
        }
        for(int i = 0; i < 4 ; i++) {
            int score2 = sc.nextInt();
            T += score2;
        }
        if(S == T) System.out.println(S);
        else System.out.println(Math.max(S,T));
    }
}
