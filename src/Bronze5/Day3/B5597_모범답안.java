package Bronze5.Day3;

import java.util.Scanner;

public class B5597_모범답안 {
    public static void main(String[] args) {
        int A[] = new int[31]; // 인덱스번호를 30번까지 만들고, 0을 포함하지 않아야 해서
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 28 ; i++) {
            int number = sc.nextInt(); // 인덱스번호가 출석번호이기 때문에 입력받은 숫자와 일치해야 함
            A[number]++; // 인덱스번호에 해당하는 배열의 값이 증가해서(0이 아님) 과제 제출했다는 뜻이 됨
        }

        for(int i = 1; i<=30 ; i++) {
            if(A[i]==0)
                System.out.println(i);
        }
    }
}
