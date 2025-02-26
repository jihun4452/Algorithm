package ex20250226;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수 입력
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        // 입력 순서대로 등수를 공백으로 구분하여 출력
        for (int i = 0; i < n; i++) {
            System.out.print(ranks[i] + (i != n - 1 ? " " : ""));
        }
    }
}
