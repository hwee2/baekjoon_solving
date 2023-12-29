package Bronze5.Day3;

import java.util.Scanner;

public class B2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int sum = 0;

        for(int i = 0; i < 5 ; i++) {
            A[i] = sc.nextInt(); // 선언한 배열에다 입력받는 수 바로 저장하고 싶을 때 for문 이용
            int temp = (int) Math.pow(A[i], 2); //Math.pow() 제곱값 구하는 함수
            sum = (sum+temp) % 10;
        }
        System.out.println(sum);
    }
}
