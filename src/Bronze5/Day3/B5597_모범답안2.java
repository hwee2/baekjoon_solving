package Bronze5.Day3;

import java.util.Scanner;

public class B5597_모범답안2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stuChk[] = new boolean[31];

        for(int i = 0; i < 28; i++) {
            stuChk[sc.nextInt()] = true;
        }

        for (int i =1; i<= 30; i++) {
            if(!stuChk[i])
                System.out.println(i);
        }
    }
}
