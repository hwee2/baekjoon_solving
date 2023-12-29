package Bronze5.Day2;

import java.util.Scanner;

public class B2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();
        char[] b = B.toCharArray();

            for (int i = (b.length - 1); i >= 0.; i--) {
                int temp = (A  * (b[i] - '0'));
                System.out.println(temp);
            }
            System.out.println(A * Integer.parseInt(B)) ;
        }
}
