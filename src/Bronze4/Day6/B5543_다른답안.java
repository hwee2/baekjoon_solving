package Bronze4.Day6;

import java.util.Scanner;

public class B5543_다른답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        int bm =Integer.MAX_VALUE, dm = Integer.MAX_VALUE;

        for (int i=0; i<3; i++) {
            burger[i] = sc.nextInt();
            if(bm > burger[i]) {
                bm = burger[i];
            }
        }

        for(int i=0; i<2; i++) {
            drink[i] = sc.nextInt();
            if (dm > drink[i]) {
                dm = drink[i];
            }
        }
        System.out.println(bm + dm - 50);
        sc.close();
    }
}

