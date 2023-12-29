package Bronze4.Day9;

import java.util.Scanner;

public class B2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int sum = L*P;
        int result = 0;

        for(int i = 0; i < 5; i++) {
            int person = sc.nextInt();
            result = person - sum;
            System.out.print(result+" ");
        }
    }
}
