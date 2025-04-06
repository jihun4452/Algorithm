package ex20250406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] sales = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sales[i] = Integer.parseInt(st.nextToken());
        }

        int[] freq = new int[501];
        int distinctCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < K; i++) {
            if (freq[sales[i]] == 0) {
                distinctCount++;
            }
            freq[sales[i]]++;
        }
        sb.append(distinctCount);

        for (int i = K; i < N; i++) {
            int leaving = sales[i - K];
            freq[leaving]--;
            if (freq[leaving] == 0) {
                distinctCount--;
            }

            int entering = sales[i];
            if (freq[entering] == 0) {
                distinctCount++;
            }
            freq[entering]++;

            sb.append(" ").append(distinctCount);
        }

        System.out.println(sb.toString());
    }
}
