package Bronze5.Day2;

import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = 1;

        for(int i = N; i > 0 ; i--) {
            temp *= i;
        }
        System.out.println(temp);
    }
}
