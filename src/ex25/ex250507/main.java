package ex25.ex250507;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();

        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else {
            System.out.println("==");
        }


    }
}
