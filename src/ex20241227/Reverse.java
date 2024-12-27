package ex20241227;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x:str){
            char[] s=x.toCharArray(); //문자 배열로 변환
            int lt=0,rt=x.length()-1; //문자 -1

            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--; //양쪽에서 바꾸면서 오기때문에 중간에 오면 실행종료
            }
            String tem=String.valueOf(s);
            answer.add(tem);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x:solution(n,str)){
            System.out.println(x);
        }
    }
}

//N개를 입력받고 그만큼의 문자열을 추출, -> n개 입력한걸 i가 알아야함 i는 리스트로 해서
//하면되고 n은? n개까지만 하면 되는구나, 솔루션 함수에 str만 넣어도 될까?