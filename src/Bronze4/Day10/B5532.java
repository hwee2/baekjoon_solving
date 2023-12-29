package Bronze4.Day10;

import java.util.Scanner;

public class B5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L = sc.nextInt();
        double A = sc.nextInt();
        double B = sc.nextInt();
        double C = sc.nextInt();
        double D = sc.nextInt();

        int k = (int)Math.ceil(A/C);
        int m = (int)Math.ceil(B/D);
        int max = Math.max(k,m);
        int result = (int)L - max;

        System.out.println(result);
    }
}
