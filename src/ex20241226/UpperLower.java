package ex20241226;

import java.util.Scanner;

public class UpperLower {

    public static String solution(String str){
        String answer="";

        for(char x:str.toCharArray()){
            if(x == Character.toUpperCase(x)) answer+=Character.toLowerCase(x);
            else answer +=Character.toUpperCase(x);
        }
        //상향된 for 문에 대해 더 알아보자

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
