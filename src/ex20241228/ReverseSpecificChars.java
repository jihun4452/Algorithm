package ex20241228;

import java.util.Scanner;

public class ReverseSpecificChars {
    public static String solution(String str){
        String answer;
        char[] s= str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt]))lt++; //lt가 알파벳이 아니라면
            else if(!Character.isAlphabetic(s[rt]))rt--; //rt가 알파벳이 아니라면 하나씩 감소
            else {
                char tem = s[lt];
                s[lt] = s[rt];
                s[rt] = tem;
                lt++;
                rt--;
            }
        }//값을 서로 변경하고 Swap, 서로가 알파벳일때만 스왑한다. 값을 변경한다.
        answer=String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
