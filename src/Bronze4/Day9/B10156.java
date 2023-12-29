package Bronze4.Day9;

import java.util.Scanner;

public class B10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = K*N - M;
        if(M >= K*N) {
            System.out.println(0);
        } else System.out.println(sum);

    }
}
