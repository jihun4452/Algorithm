package ex20250107;

import java.util.Scanner;

public class Main {
    public static int solution(String s) {
        int answer = 0;
        for(char x : s.toCharArray()) {
            if(x>= 48 && x<= 57) {
                answer = answer * 10 + (x -48);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(solution(str));
    }
}
//아스키값을 사용한다. (어렵다)