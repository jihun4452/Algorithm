package ex20240307;

import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] result = new int[N];
        Map<Integer, Integer> freqMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && freqMap.get(stack.peek()) <= freqMap.get(A[i])) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(A[i]);
        }

        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

