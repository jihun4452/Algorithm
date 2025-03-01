package ex20250301;

import java.util.*;

public class main {
    public static int countMentorMenteePairs(int N, int M, int[][] tests) {
        int count = 0;

        for (int mentor = 1; mentor <= N; mentor++) {
            for (int mentee = 1; mentee <= N; mentee++) {
                if (mentor == mentee) continue;

                boolean isValid = true;
                for (int i = 0; i < M; i++) {
                    int mentorRank = -1, menteeRank = -1;
                    for (int j = 0; j < N; j++) {
                        if (tests[i][j] == mentor) mentorRank = j;
                        if (tests[i][j] == mentee) menteeRank = j;
                    }
                    if (mentorRank > menteeRank) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] tests = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                tests[i][j] = sc.nextInt();
            }
        }

        System.out.println(countMentorMenteePairs(N, M, tests));
    }
}
