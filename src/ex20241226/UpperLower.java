package ex20241226;

import java.util.Scanner;

public class UpperLower {
    public static int solution(String str, char c){
        int answer=0;

        str=str.toUpperCase();
        c=Character.toUpperCase(c);

        for(char x:str.toCharArray()){
            if(x==c){
                answer++;
            }
        }
        System.out.println(str);

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c= sc.next().charAt(0);
        System.out.println(solution(str,c));
    }
}


//package ex20241226;
//
//import java.util.Scanner;
//
//public class UpperLower {
//
//    public static String solution(String str){
//        String answer="";
//
//        for(char x:str.toCharArray()){
//            if(x == Character.toLowerCase(x)){
//                answer+=Character.toUpperCase(x);
//            }else {
//                answer+=Character.toLowerCase(x);
//            }
//        }
//        //상향된 for 문에 대해 더 알아보자
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(solution(str));
//    }
//}
