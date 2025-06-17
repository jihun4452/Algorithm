package ex25_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static char solution(int n, String s) {
		char answer = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		for (char x : s.toCharArray()){
			map.put(x,map.getOrDefault(x,0)+1);
		}
		int MAX = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if (map.get(key) > MAX) {
				MAX = map.get(key);
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();

		System.out.println(solution(n, s));
	}
}
