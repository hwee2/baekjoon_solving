package Bronze4.Day2;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());  //readline은 String 값이라 int로 변환해줘야 함

        for(int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //공백 구분해서 받으려면 토크나이저 사용
            // br리드라인을 토크나이저로 한번 감싼 게 st(공백 구분 가능) 이후로 st로 사용

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A+B+"\n"); //바로 출력하는 게 아니라  쌓아두고 있음
            // 다음칸 넘기고 싶으면 줄바꿈 직접 입력해줘야 함
        }
        bw.flush(); // 위에서 쌓아둔 거 한번에 출력
        bw.close(); // 시스템에서 닫아줘야 함
    }
}
