package ex25.ex250227;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrB = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n && j < m) {
            if (arrA[i] == arrB[j]) {
                sb.append(arrA[i]).append(" ");
                i++;
                j++;
            } else if (arrA[i] < arrB[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(sb.toString().trim());
    }
}
