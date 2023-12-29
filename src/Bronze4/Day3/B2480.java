package Bronze4.Day3;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       if(a==b && b==c) {
           int reward1 = 10000 + a * 1000;
           System.out.println(reward1);
       } else if (a==b || a == c || b==c) {
           if (a==b) {
               int reward2 = 1000 + a * 100;
               System.out.println(reward2);
           } else {
               int reward3 = 1000 + c * 100;
               System.out.println(reward3);
           }
       } else {
           int max = Math.max(a,Math.max(b,c));
           System.out.println(max*100);
       }
    }
}
