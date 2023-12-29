package Bronze4.Day1;

import java.util.Scanner;

public class B2439_다른답안1 {

        static Scanner scanner;

        public static void main(String[] args) {
            scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            String star = "";

            for(int i=input; i>0; i--)
                System.out.printf("%"+input+"s\n",star+="*");
        }
    }

