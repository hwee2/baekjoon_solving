package Bronze5.Day3;

import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for(int i = 0 ; i < N ; i++) {
            arr[i] = sc.nextInt(); // N만큼 입력받고, 배열에 저장
        }
        int V = sc.nextInt();

        for(int j = 0; j < arr.length; j++) {
            if(V == arr[j]) { // 각 인덱스번호에 해당하는 값들이 V에 입력한 값과 같은지 확인
                count++;
            }
        }
        System.out.println(count);
    }
}
