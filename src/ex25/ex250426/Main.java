package ex25.ex250426;

import java.util.Scanner;

public class Main {
    public static String soultion(String str) {
        String answer = "YES";

        String LowerStr = str.toLowerCase();
        int LowerLen= LowerStr.length();
        for(int i = 0; i < LowerLen/2; i++) {
            if(LowerStr.charAt(i) != LowerStr.charAt(LowerLen-1-i)){
                answer = "NO";
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.print(soultion(str));
    }
}
