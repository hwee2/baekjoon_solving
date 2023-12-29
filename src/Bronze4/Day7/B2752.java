package Bronze4.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class B2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        Arrays.sort(A); //오름차순
        System.out.println(A[0]+" "+A[1]+" "+A[2]);
    }
}
