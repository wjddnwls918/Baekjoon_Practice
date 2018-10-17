import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_13459 {

		static int N,M;
		static char map[][];
		static char copymap[][];
		
		//위 오른 아래 왼
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {1, 0, -1, 0};
		
		static boolean isOk;
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tem[];
		tem = in.readLine().split(" ");
		N = Integer.parseInt(tem[0]);
		M = Integer.parseInt(tem[1]);
		
		map = new char[N][M];
		String temp;
		for(int i=0; i<N; i++) {
			temp = in.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = temp.charAt(j);
			}
		}
		
		
		Queue<Info> que = new ArrayDeque<>();
		//첫번째 거
		que.add(new Info(0,map));
		
		
		
		
		isOk = false;
		
		/*boolean curResult = toUp(map);
		
		System.out.println("curResult : " + curResult + " isOk : "+ isOk);
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(map[i][j]);
				if(j == M-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}*/
		
		
		while (!que.isEmpty()) {
			
			Info cur = que.poll();
			
			
			//10회면 
			if(cur.cnt == 11)
				continue;
			
			
			//왼
			char temMap[][] = new char [N][M];
			copyArr(cur.curMap,temMap);			
			boolean curTemp = toLeft(temMap);
			if(isOk)
				break;			
			if(curTemp) {
				que.add(new Info(cur.cnt+1,temMap));
			}
			
			
			//오
			temMap = new char [N][M];
			copyArr(cur.curMap,temMap);	
			curTemp = toRight(temMap);
			if(isOk)
				break;			
			if(curTemp) {
				que.add(new Info(cur.cnt+1,temMap));
			}
			
			//아래
			temMap = new char [N][M];
			copyArr(cur.curMap,temMap);	
			curTemp = toBottom(temMap);
			if(isOk)
				break;			
			if(curTemp) {
				que.add(new Info(cur.cnt+1,temMap));
			}
			
		
			//위
			temMap = new char [N][M];
			copyArr(cur.curMap,temMap);	
			curTemp = toUp(temMap);
			if(isOk)
				break;			
			if(curTemp) {
				que.add(new Info(cur.cnt+1,temMap));
			}
		}
		
		
		//결과 출력
		if(isOk) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
				
	}
	
	
	public static boolean toLeft(char map[][]) {
		
		boolean redOut = false;
		boolean blueOut = false;
		
		for(int i=1; i<N-1; i++) {
			for(int j=0; j<M; j++) {
				
				if(map[i][j] == 'R' || map[i][j] == 'B') {
					
					int k = j-1;
					while( true ) {
						
						
						if(map[i][k] == 'O' || map[i][k] == 'R' || map[i][k] == 'B' || map[i][k] == '#')
							break;
						
						if(k <1)
							break;
						
						
						k--;
						
												
					}
					
					if(map[i][k] == 'O') {
						
						if(map[i][j] == 'R') {
							redOut = true;
							map[i][j] = '.';
						}
						if(map[i][j] == 'B') {
							blueOut = true;
							map[i][j] = '.';
						}
						
					}else {
						char temp = map[i][k+1];
						map[i][k+1] = map[i][j];
						map[i][j] = temp;
					}
					
					
				}				
			}
		}
		
		
		if(redOut && blueOut) {
			isOk = false;
			return false;
		}else if( redOut ) {
			isOk = true;
			return true;
		}else if( blueOut) {
			isOk = false;
			return false;
		}else {
			return true;
		}
		
		
	}
	public static boolean toRight(char map[][]) {
		
		boolean redOut = false;
		boolean blueOut = false;
		
		for(int i=1; i<N-1; i++) {
			for(int j=M-1; j>=1; j--) {
				
				if(map[i][j] == 'R' || map[i][j] == 'B') {
					
					int k = j+1;
					while( true ) {
						
						
						if(map[i][k] == 'O' || map[i][k] == 'R' || map[i][k] == 'B' || map[i][k] == '#')
							break;
						
						if(k <1)
							break;
						
						
						k++;
						
												
					}
					
					if(map[i][k] == 'O') {
						
						if(map[i][j] == 'R') {
							redOut = true;
							map[i][j] = '.';
						}
						if(map[i][j] == 'B') {
							blueOut = true;
							map[i][j] = '.';
						}
						
					}else {
						char temp = map[i][k-1];
						map[i][k-1] = map[i][j];
						map[i][j] = temp;
					}
					
					
				}				
			}
		}
		
		
		if(redOut && blueOut) {
			isOk = false;
			return false;
		}else if( redOut ) {
			isOk = true;
			return true;
		}else if( blueOut) {
			isOk = false;
			return false;
		}else {
			return true;
		}
		
		
		
	}
	public static boolean toBottom(char map[][]) {
		
		
		boolean redOut = false;
		boolean blueOut = false;
		
		for(int j=1; j<M-1; j++) {
			for(int i=N-1; i>=1; i--) {
				
				if(map[i][j] == 'R' || map[i][j] == 'B') {
					
					int k = i+1;
					while( true ) {
						
						
						if(map[k][j] == 'O' || map[k][j] == 'R' || map[k][j] == 'B' || map[k][j] == '#')
							break;
						
						if(k <1)
							break;
						
						
						k++;
						
												
					}
					
					if(map[k][j] == 'O') {
						
						if(map[i][j] == 'R') {
							redOut = true;
							map[i][j] = '.';
						}
						if(map[i][j] == 'B') {
							blueOut = true;
							map[i][j] = '.';
						}
						
					}else {
						char temp = map[k-1][j];
						map[k-1][j] = map[i][j];
						map[i][j] = temp;
					}
					
					
				}				
			}
		}
		
		
		if(redOut && blueOut) {
			isOk = false;
			return false;
		}else if( redOut ) {
			isOk = true;
			return true;
		}else if( blueOut) {
			isOk = false;
			return false;
		}else {
			return true;
		}
		
	}
	public static boolean toUp(char map[][]) {
		
		boolean redOut = false;
		boolean blueOut = false;
		
		for(int j=1; j<M-1; j++) {
			for(int i=1; i<N-1; i++) {
				
				if(map[i][j] == 'R' || map[i][j] == 'B') {
					
					int k = i-1;
					while( true ) {
						
						
						if(map[k][j] == 'O' || map[k][j] == 'R' || map[k][j] == 'B' || map[k][j] == '#')
							break;
						
						if(k <1)
							break;
						
						
						k--;
						
												
					}
					
					if(map[k][j] == 'O') {
						
						if(map[i][j] == 'R') {
							redOut = true;
							map[i][j] = '.';
						}
						if(map[i][j] == 'B') {
							blueOut = true;
							map[i][j] = '.';
						}
						
					}else {
						char temp = map[k+1][j];
						map[k+1][j] = map[i][j];
						map[i][j] = temp;
					}
					
					
				}				
			}
		}
		
		
		if(redOut && blueOut) {
			isOk = false;
			return false;
		}else if( redOut ) {
			isOk = true;
			return true;
		}else if( blueOut) {
			isOk = false;
			return false;
		}else {
			return true;
		}
		
		
	}
	
	public static void copyArr(char src[][], char dst[][]) {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				dst[i][j] = src[i][j];								
			}
		}
		
	}
	
	static class Info{
		int cnt;
		char curMap[][] = new char[N][M];
		
		public Info(int cnt) {
			this.cnt = cnt;
		}
		public Info(int cnt, char map[][]) {
			this.cnt = cnt;
			copyArr(map,this.curMap);
		}
		
	}

}
