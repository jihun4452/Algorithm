package ex25.ex250426;

import java.util.Scanner;

public class Main {
    public static String soultion(String str) {
        String answer = "YES";

        str = str.toLowerCase();

        int len = str.length();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                answer = "NO";
                break;
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
