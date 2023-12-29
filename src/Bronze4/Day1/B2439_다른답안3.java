package Bronze4.Day1;

import java.util.Scanner;

public class B2439_다른답안3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();

        for(int i = 0 ; i < loop ; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j <= i ; j++){
                sb.append("*");
            }
            System.out.println(String.format("%"+loop+"s", sb.toString()));
        }
    }
}
