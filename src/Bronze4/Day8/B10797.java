package Bronze4.Day8;

import java.util.Scanner;

public class B10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[5];
        int count = 0;

        for(int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();
            if(n == a[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
