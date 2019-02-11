// DFS dfs순열 구하기 예제 
// 3-> 123, 132,  // 4-> 1234,1423,1324, 
// depth 0 
//		1, 2, 3
//	(1,2),(1,2,3),(1,2,3)

package kosta.algorithm01;

import java.util.Scanner;

public class Solution02 {
	static int T, N;
	// T -> case , N -> num
	static int visited[] = new int[7];
	static int Answer[] = new int[7];

	static void dfs(int depth) {
		// 종료조건
		if (depth == N + 1) {
			for (int i = 1; i <= N; i++) {
				System.out.print(Answer[i] + " ");
			}
			System.out.println();
		}
		
		// 탐색조건
		else {
			for (int i = 1; i <= N; i++) {
				if (visited[i] == 0) {
					visited[i] = 1;
					Answer[depth] = i;

					dfs(depth + 1);

					visited[i] = 0;
					Answer[depth] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("T -> test값을 입력: ");
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.print("N 값을 입력: ");
			N = sc.nextInt();
			for (int i = 1; i < N; i++) {
				visited[i] = 0;
			}
			System.out.println("#" + test_case);
			dfs(1);

		}
	}

}
