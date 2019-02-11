package kosta.algorithm01;

import java.util.Scanner;

public class Solution05_result {
	static int T,N,M;
	static int Answer;
	static int visited[] = new int[11];
	static int MAT[][] = new int[11][11];
	
	//���� �湮���� ���� ��ȣ, ������� ������ �����, �湮�� ���� ��
	public static void dfs(int idx, int cost, int cnt) {
		//��� ���ø� ���� �湮���� ��
		//��������
		if(cnt == N) {
			//���������� ���ư� ���� ���� ��츸
			if(MAT[idx][M] != 0) {
				//���� �亸�� ���ο� ����� �� ���� ��ٸ�
				if(Answer == -1 || Answer > cost + MAT[idx][M]) {
					Answer = cost + MAT[idx][M];
				}
			} 
		//Ž������
		}else {
			for(int i=1;i<=N;i++) {
				//�湮�� ���� ����, ���� �ִ� ���ø� �˻�
				if(visited[i] == 0 && MAT[idx][i] != 0) {
					//����ġ��, ���� ���亸�� ��������� ���� ��츸 �˻�
					if((Answer == -1 || Answer > cost + MAT[idx][i])){
						visited[i] = 1;
						dfs(i, cost + MAT[idx][i], cnt +1);
						visited[i] = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		for(int test_case=1;test_case<=T;test_case++) {
			N = sc.nextInt();//������ ��
			M = sc.nextInt();//�����
			
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
					MAT[i][j] = sc.nextInt();
				}
			}
			
			Answer= -1;
			visited[M] = 1;
			//DFS Ž��(��ġ, ���, ������� �湮�� ������ ��)
			dfs(M, 0, 1);
			System.out.println("#" + test_case + " " + Answer);
			
		}
	}
}
