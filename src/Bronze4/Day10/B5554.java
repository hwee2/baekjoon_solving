package Bronze4.Day10;

import java.util.Scanner;

public class B5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int s = 0;
        int sum = 0;

        for(int i = 0; i < 4 ; i++) {
            int time = sc.nextInt();
            sum += time;
            if(sum >= 60) {
                m = sum/60;
                s = sum%60;
            }
        }
        System.out.println(m);
        System.out.println(s);
    }
}
