import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Ac_16235 {

	static int N, M, K;
	static int yang[][];
	static int addYang[][];
	static int deathTree[][];
	static PriorityQueue<Integer> que[][];
	static PriorityQueue<Integer> tempQue[][];

	// 왼위 위 오위 오 오아래 아래 왼아래 왼
	static int dx[] = { -1, 0, 1, 1, 1, 0, -1, -1 };
	static int dy[] = { -1, -1, -1, 0, 1, 1, 1, 0 };

	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String temp[];
		temp = in.readLine().split(" ");

		// 초기화
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		K = Integer.parseInt(temp[2]);

		yang = new int[N][N];
		addYang = new int[N][N];
		deathTree = new int[N][N];

		que = new PriorityQueue[N][N];
		tempQue = new PriorityQueue[N][N];

		for (int i = 0; i < N; i++) {
			temp = in.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				yang[i][j] = 5;
				addYang[i][j] = Integer.parseInt(temp[j]);
				que[i][j] = new PriorityQueue<>();
				tempQue[i][j] = new PriorityQueue<>();
			}
		}

		for (int i = 0; i < M; i++) {
			temp = in.readLine().split(" ");
			int y = Integer.parseInt(temp[0]) - 1;
			int x = Integer.parseInt(temp[1]) - 1;
			int age = Integer.parseInt(temp[2]);

			que[y][x].add(age);
		}

		// K년도 까지
		for (int i = 0; i < K; i++) {

			// 초기화
			deathTree = new int[N][N];

			spring();
			summer();
			fall();
			winter();
		}

		//printQue();
		//printYang();

		// 결과 출력
		System.out.println(totalCnt());

	}

	public static void spring() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (que[i][j] != null) {
					int size = que[i][j].size();
					for(int k=0; k<size; k++) {
						int cur = que[i][j].peek();
						//System.out.println(cur);
						if (yang[i][j] - cur >= 0) {
							yang[i][j] -= cur;
							que[i][j].poll();
							tempQue[i][j].add(cur + 1);
						} else {
							break;
						}

					}
				}

			}
		}
	}

	public static void summer() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (que[i][j]!= null) {
					Iterator<Integer> itr = que[i][j].iterator();
					while (itr.hasNext()) {
						int curDeath = itr.next() / 2;
						//System.out.println("death: " + curDeath +"y : "+ i +" x : "+ j);
						yang[i][j] += curDeath;
					}
				}
			}
		}

	}

	public static void fall() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (tempQue[i][j] != null) {
					Iterator<Integer> itr = tempQue[i][j].iterator();
					while (itr.hasNext()) {
						int cur = itr.next();
						// 5의 배수이면
						if (cur % 5 == 0) {
							// 8방향으로
							for (int k = 0; k < 8; k++) {
								int nx = j + dx[k];
								int ny = i + dy[k];

								// 범위 안에 들면
								if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
									// 1인 나무 추가
									tempQue[ny][nx].add(1);
								}
							}
						}
					}
				}
			}
		}
	}

	public static void winter() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				yang[i][j] += addYang[i][j];
			}
		}

		
		
		initQueue();
		
		//printQue();
	}

	public static int totalCnt() {

		int total = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (que[i][j] != null) {
					total += que[i][j].size();
					// System.out.println("age : "+ que[i][j].peek());
				}
			}
		}
		return total;
	}

	public static void initQueue() {
		que = new PriorityQueue[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				que[i][j] = new PriorityQueue<>();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (tempQue[i][j].size() != 0) {
					//System.out.println("tempQue Size : " + tempQue[i][j].size());
					while (!tempQue[i][j].isEmpty()) {
						int temp = tempQue[i][j].poll();
						
						que[i][j].add(temp);
					}				
				}
			}
		}

		tempQue = new PriorityQueue[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tempQue[i][j] = new PriorityQueue<>();
			}
		}

	}

	public static void printQue() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(que[i][j].size());
				if (j == N - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void printYang() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(yang[i][j]);
				if (j == N - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}

}

//정답 ..
