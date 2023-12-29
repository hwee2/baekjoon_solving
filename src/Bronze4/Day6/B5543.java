package Bronze4.Day6;

import java.util.Scanner;

public class B5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min1 = Math.min(a,Math.min(b,c));

        int d = sc.nextInt();
        int f = sc.nextInt();

        int min2 = Math.min(d,f);

        System.out.println(min1+min2-50);
    }
}
