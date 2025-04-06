package ex25.ex20250108;

import java.util.Scanner;

public class rotateReverse {
    public static String solution(String str) {
        String answer = "NO";
        String str1= str.toUpperCase().replaceAll("[^A-Z]", "");
        String tem = new StringBuilder(str1).reverse().toString();
        if(str1.equals(tem)){ answer = "YES";}
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(solution(str));
    }
}
