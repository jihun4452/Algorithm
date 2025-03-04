package ex20250304;

import java.util.Scanner;

public class main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] grid = new int[n + 2][n + 2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int peakCount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean isPeak = true;
                int current = grid[i][j];

                for (int k = 0; k < 4; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    if (grid[ni][nj] >= current) {
                        isPeak = false;
                        break;
                    }
                }

                if (isPeak) peakCount++;
            }
        }

        System.out.println(peakCount);
        sc.close();
    }
}
