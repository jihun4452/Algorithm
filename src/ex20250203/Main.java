package ex20250203;

import java.util.Scanner;

public class Main {
    public static int solution(int n, int[] arr) {
        int totalScore = 0;
        int consecutive = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                consecutive++;
                totalScore += consecutive;
            } else {
                consecutive = 0;
            }
        }
        return totalScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
