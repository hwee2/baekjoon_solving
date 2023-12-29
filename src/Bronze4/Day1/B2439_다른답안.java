package Bronze4.Day1;

import java.util.Scanner;

public class B2439_다른답안 {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int T=scan.nextInt();
            String star="*";

            for(int i=0; i<T; i++) {
                String format=String.format("%"+T+"s", star);
                System.out.println(format);
                star+="*";
            }
        }
    }
