package Bronze4.Day11;

import java.util.Scanner;

public class B1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String s = sc.nextLine(); //next = 공백 전까지 입력받은 문자열 리턴 / nextline = 엔터 전까지 / 엔터치기 전까지 카운트 누적해서 합함
            int count = 0;

            if(s.equals("#")) {
                break;
            }
            char[] arr = s.toCharArray();

            for(int i = 0; i < s.length(); i++) {
                if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'||
                        arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
