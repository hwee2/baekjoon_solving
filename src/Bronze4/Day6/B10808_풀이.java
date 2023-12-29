package Bronze4.Day6;

import java.util.Scanner;

public class B10808_풀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[26];

        for(int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            a[c-97]++;
        }
        for(int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
