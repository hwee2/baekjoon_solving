package Bronze5.Day3;

import java.util.Scanner;

public class B2744_모범답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        //대문자에 32를 더하면 소문자가 된다.
        for(int i = 0; i< text.length ;i++){ //배열일 경우 length만 아닐 땐 ()도 붙이는듯
            char temp = text[i];
            if(temp >= 'a' && temp <= 'z'){
                System.out.println((char)(temp-32));
            } else{
                System.out.println((char)(temp+32));
            }
        }
    }
}
