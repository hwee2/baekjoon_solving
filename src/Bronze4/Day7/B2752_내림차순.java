package Bronze4.Day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B2752_내림차순 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] A = new Integer[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        Arrays.sort(A, Collections.reverseOrder()); //내림차순
        System.out.println(A[0]+" "+A[1]+" "+A[2]);
    }
}
