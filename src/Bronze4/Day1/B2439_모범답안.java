package Bronze4.Day1;

import java.util.Scanner;

public class B2439_모범답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i > 0 ; i--) {
            for(int j = 1 ; j <= N ; j++) {
               if(j>=i) System.out.print("*"); // j  찍으면 5 -45 - 345 -2345 -12345 이렇게 뜨는 거 알 수 있음. 이 숫자들이랑 i 비교해서 공백,별 찍음
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
