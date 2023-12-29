package Bronze4.Day6;

import java.util.Scanner;

public class B10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];  //알파벳 개수를 저장하는 배열
        String s = sc.next();  //단어 입력받기

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 97]++;  //개수 1씩 늘려주기 , a의 아스키코드가 97, 빼서 나온 수인 인덱스 번호에다 횟수 저장해놓음
            //ex. 맨 앞에 있는 b는 인덱스 번호 0에 저장되어 있음 > charAt(0) 불러왔더니 B고 얘는 아스키코드 98임 그래서 97빼면 1이라서
            // arr의 인덱스 번호 1번에다 저장됨
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
