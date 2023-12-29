package Bronze4.Day5;

import java.util.Scanner;

public class B10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < arr.length ;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 40) {
                sum+=40;
            } else {
                sum+=arr[i];
            }
        }
        System.out.println(sum/5);
    }
}
