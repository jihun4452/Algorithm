package ex24.ex20241224;

import java.util.Scanner;

public class MaxLength {
    public static String solution(String str){
        String answer= "";

        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tep=str.substring(0,pos);
            int len=tep.length();
            if(len>m){
                m=len;
                answer=tep;

            }
            str=str.substring(pos+1);
        }

//        int min=Integer.MIN_VALUE;
//        String[] s=str.split(" ");
//        //중간 공백
//        for (String x:s) {
//            int len=x.length();
//            if(len<min){
//                min=len;
//                answer=x;
//            }
//        }
        return answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
