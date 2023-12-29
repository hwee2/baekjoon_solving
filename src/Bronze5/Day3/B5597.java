package Bronze5.Day3;

import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for(int i = 1 ; i <29 ; i++) {
            int submit = sc.nextInt(); // 인덱스번호가 출석번호이기 때문에 일치해야 함
            student[submit] = 1; // 입력받은 수 = 출석번호, 출석번호는 결과값이 아닌 인덱스 번호가 됨 -> 결과값을 1로 저장함으로써 제출했다는 뜻이 됨
        }
        for(int i = 1 ; i <= 30 ;i++) {
            if(student[i] == 0)
                System.out.println(i);
        }
    }
}
