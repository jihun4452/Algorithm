package ex25.ex250426;

import java.util.Scanner;

public class Main {
    public static String soultion(String str) {
        String answer = "";
        int len=str.length();

        for(int i=0;i<len;i++) {
            if(i== str.indexOf(str.charAt(i))){
                answer+=str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(soultion(str));
    }
}
