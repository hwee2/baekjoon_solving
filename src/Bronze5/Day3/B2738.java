package Bronze5.Day3;

import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        for(int i = 0; i < N ; i++) {
            for(int j = 0; j < M ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N ; i++) {
            for(int j = 0; j < M ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N ; i++) {
            for (int j = 0; j < M; j++) {
                int sum = arr[i][j] + arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
