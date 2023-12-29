package Bronze4.Day15;

import java.util.Scanner;

public class B5575 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3 ; i++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();

            int start = (h1*3600) + (m1*60) + s1;
            int end = (h2*3600) + (m2*60) + s2;

            int Time = end - start;
            int H = Time / 3600;
            int M = (Time % 3600) / 60;
            int S = (Time % 3600) % 60;

            System.out.println(H+" "+M+" "+S);
        }
    }
}
