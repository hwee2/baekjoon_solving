package Bronze4.Day5;

import java.util.Scanner;

public class B10039_모범답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i <5 ;i++) {
            int temp = sc.nextInt();
            if (temp < 40) temp=40;
            sum += temp;
        }
        System.out.println(sum/5);
    }
}
