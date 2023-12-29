package Bronze5.Day3;

import java.util.Scanner;

public class B4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B ==0) {  //  break이 먼저 떠야 NO 안 뜨고 종료. (아래 조건 검증도 안 하고 끝나서. 만약 뒤로 가면 숫자 큰지 작은지 검증하기 때문에 NO도 같이 뜸
                break;
            }
            if(A > B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}