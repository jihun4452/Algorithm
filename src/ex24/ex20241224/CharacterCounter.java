package ex24.ex20241224;

import java.util.Scanner;

public class CharacterCounter {

    public static int solutoin(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t=Character.toUpperCase(t);
        System.out.println(str);
        for(char x : str.toCharArray()){
            if(x==t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=sc.next().charAt(0);
        System.out.println(solutoin(str,c));

    }
}