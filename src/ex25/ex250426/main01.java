package ex25.ex250426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int M=0;
        int Y=0;
        int sumY=0;
        int sumM=0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());

            sumY=((n/30)+1) *10;
            sumM=((n/60)+1) *15;

            Y+=sumY;
            M+=sumM;
        }

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}
