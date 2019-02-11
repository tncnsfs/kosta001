//
//
//외판원 순회 문제
//
//1번부터 N번까지 번호가 매겨져 있는 도시가 있고, 
//도시들 사이에 길이 있는 경우에만 이동할 수 있다. 
// * 1	-> N 번 까지  


// 여행을 좋아하는 종민이는 M번 도시에서 출발하여 
// 출발지를 제외한 모든 도시를 정확히 한 번씩만 방문한 후 

// * 종민이 : M번도시(출발) -> 각 1번씩 방문  


//처음 출발지인 M번 도시로 돌아오려 한다. 
// 이때 도시들 사이의 길을 지날갈 때 지불해야 하는 통행료가 있어,
//종민이는 최소한의 비용으로 모든 도시를 여행하고 싶다. 
// 종민이가 모든 도시를 여행할 때 필요한 최소비용을 출력하는 프로그램을 작성하시오.
//


//[입력]
//첫 번째 줄에 테스트케이스의 수 T(1<= T <= 10)가 주어진다.
//각 테스트케이스 마다 첫 번째 줄에는 도시의 수 N과 출발지 M이 공백을 두고 주어진다.



//(3<=N<=10, 1<=M<=N) 
// 다음 N개의 줄에는 각 줄에 N개의 숫자들이 공백을 두고 주어지는데 
// i번째 줄의 j번째 숫자는  i번째 도시에서 j번째 도시로 가는 드는 통행료 MAT[i][j]를 의미한다.


// 만약 통행료가 0인 경우는 i도시에서 j도시로 가는 길이 없음을 의미하다. 
// (0<=MAT[i][j]<=50)




//
//[제한조건]
//- 도시를 잇는 도로는 일방통해이다. 심지어 i번째 도시에서 j번째 도시로 가는
//길은 있어도, j번째 도시에서 i번째 도시로 가는 길은 없을 수도 있다.
//- 모든 도시를 정확히 한 번씩만 지나야 함에 유의하라.
//
//[출력]
//각 줄마다 "#T(T는 테스트케이스 번호)를 출력한 뒤, 종민이가 M번 도시부터
//시작하여 모든 도시를 정확히 한 번씩 순회하고 오는데 드는 통행료 최소값을
//출력하시오. 단 불가능할 경우 -1을 출력한다.
//
//[sample]
//3 => T

//3 1

//0 	1 		1
//1 	0 		10
//2 	20 	0



//4 3
//0 8 13 30
//5 0 6 20
//6 11 0 21
//7 7 6 0
//5 5
//0 17 0 3 0
//1 0 3 4 5
//0 5 0 2 5
//44 10 0 0 0
//9 3 9 7 0
//
//[sampe output]
//#1 13
//#2 40
//#3 30
//

package kosta.algorithm01;

import java.util.Scanner;

public class Solution05 {
	// test 수, 도시개수, 출발도시 
	
	static int T,N,M;
	static int Answer;
	static int visited[] = new int[11];
	static int MAT[][] = new int[11][11];
	
	//현재 방문중인 정점 번호, 현재까지 누적된 통행료, 방문한 도시 수
	
	//DFS 탐색(위치, 비용, 현재까지 방문한 도시의 수)
	public static void dfs(int idx, int cost, int cnt) {
		//모든 도시를 전부 방문했을 때
		//종료조건
		if(cnt == N) {
			for(int i=1; i<= N; i++){
				System.out.println(Answer + "종료 ");
			}
			System.out.println(N);
		//탐색조건
		}else {
			for(int i =1; i<= N; i++){
				if(visited[i] == 0){
					visited[i] = 1;
					idx = i;
					dfs(idx, MAT[i][cost], cnt);
					System.out.println("MAT[i][cost]" + MAT[i][cost]);
				}
			}
			
			
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("T -> 테스트 값 입력 :");
		T= sc.nextInt();
		for(int test_case=1;test_case<=T;test_case++) {
			System.out.println("도시수 N값 -> 입력: ");
			N = sc.nextInt();//도시의 수
			System.out.println("출발지 M값 -> 입력: ");
			M = sc.nextInt();//출발지
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					MAT[i][j] = 0;
				}
			}
			
			for(int i=1;i<=N;i++) {
				visited[i] = 0;
			}
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					System.out.println("MAT(통행료) 입력: ");
					MAT[i][j] = sc.nextInt();
					
					System.out.println("MAT(통행료)" + MAT[i][j] +", ["+ i+", "+ j + "]");
				}
			}
			
			Answer= -1;
			visited[M] = 1;
			//DFS 탐색(위치, 비용, 현재까지 방문한 도시의 수)
			dfs(M, 0, 1);
			System.out.println("#" + test_case + " " + Answer);
			
		}
	}
}
