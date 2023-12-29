package Bronze4.Day15;

import java.util.Scanner;

public class B24273_녹색거탑_다른풀이 {
    public static void main(String[] args) {
        //현재 층의 모든 경우의 수는 바로 이전 층(아래층)의 경우의 수 *2
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 1;
        for(int i = 0; i < N ; i++) {
            sum *= 2;
        }
        System.out.println(sum);
    }
}
