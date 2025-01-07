package ex24.ex20241229;

import java.util.Scanner;

public class StringDeduplication {
    public static String solution(String str) {
        String answer="";

        for(int i=0;i<str.length();i++) {
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }//인덱스 오브로 처음 발견된 문자열이 발견, charAt과 같은지 비교 같다면 그것만 Answer에 추가한다.

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(solution(str));
    }
}
