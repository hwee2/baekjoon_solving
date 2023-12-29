package Bronze4.Day6;

import java.util.Scanner;

public class B5543_다른풀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr1.length ; i++) {
            arr1[i] = sc.nextInt();
            if(min1 > arr1[i]) {
                min1 = arr1[i];
            }
        }

        for(int i = 0; i < arr2.length ; i++) {
            arr2[i] = sc.nextInt();
            if(min2 > arr2[i]) {
                min2 = arr2[i];
            }
//            // 프로그래밍에서 '=' 대입의 의미이기 때문에 순서 바꾸면 결과가 달라짐!
//            if(arr2[i] < min2) {
//                arr2[i] = min2;
            // 그래서 이 값에서도 arr2 가 작으면 원래 있던 min2값이 arr2가 된다는 뜻이라 원하는 결과가 안 나옴!!
        }
        System.out.println(min1 + min2 - 50);
        sc.close();
    }
}
