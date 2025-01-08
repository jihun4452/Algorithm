package ex20250108;

import java.util.Scanner;

public class RotateString {
    public static String solution(String str) {
        String answer = "NO";

        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverseStr)) {answer = "YES";}

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}


//길이의 절반까지만 돌게하면된다.