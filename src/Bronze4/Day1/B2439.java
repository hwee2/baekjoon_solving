package Bronze4.Day1;

import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String star = "*";

        for(int i = 1; i <= N ; i++) {
                System.out.printf("%"+N+"s",star);
                star+="*";
                System.out.println();
            }
        }
    }
