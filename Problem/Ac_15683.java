import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_15683 {

		static int N,M;
		static int map[][];
		static int checkMap[][];
		static int check[][];
		
		//위 오른 아래 왼
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static int cnt;
		static int temCnt;
		static int dir[];
		
		static int minResult;
		
		static ArrayList<Info> arr;
		
		static int cnt_6;
		
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tem[] = in.readLine().split(" ");
		N = Integer.parseInt(tem[0]);
		M = Integer.parseInt(tem[1]);
		
		arr = new ArrayList();		
		map = new int[N][M];
		cnt_6 = 0;
		for(int i=0; i<N; i++) {
			tem = in.readLine().split(" ");
			
			for(int j=0; j<M; j++) {
				
				map[i][j] = Integer.parseInt(tem[j]);								
				
				if(map[i][j] >=1 && map[i][j] <= 5) {
					arr.add(new Info(j,i,map[i][j]));
				}				
				
				if(map[i][j] == 6)
					cnt_6++;
			}
		}
		
		//System.out.println(arr.size());
		
		cnt = arr.size();
		dir = new int[cnt];
		minResult = 987654321;		
		if(arr.size()!= 0) {
			if(arr.get(0).camNum == 1) {
				
			  for(int i=0; i<4; i++) {	
				dir[0] = i;
				dfs(1);
			  }
				
			}else if(arr.get(0).camNum == 2) {
				
			  for(int i=0; i<2; i++) {		
				  dir[0] = i;
				  dfs(1);
			  }
			  
			}else if(arr.get(0).camNum == 3) {
			  
			  for(int i=0; i<4; i++) {	
				  dir[0] = i;
				  dfs(1);
		      }	
				
				
			}else if(arr.get(0).camNum == 4) {
				
			  for(int i=0; i<4; i++) {	
				  dir[0] = i;
				  dfs(1);
		      }	
				
				
			}else {
				dir[0] = 4;
				dfs(1);
			}
		}
		
		if(minResult == 987654321) {
		
			System.out.println(M*N - cnt_6);
		}else {

			System.out.println(minResult);
		}
		
	}
	
	static void copyMap(int src[][], int dst[][]) {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				dst[i][j] = src[i][j];
			}
		}
		
	}
	
	static void dfs(int depth) {
		
		if(depth == cnt) {
			
			checkMap = new int[N][M];
			check = new int[N][M];
			
			copyMap(map,checkMap);
			
			temCnt = 0;
			/*for(int i=0; i<cnt; i++) {
				System.out.print(dir[i]);
			}
			System.out.println();*/
			
			
			
			for(int i=0; i<cnt; i++) {
				
				
				if(arr.get(i).camNum == 1) {
					
					  checkCCTV(arr.get(i).x,arr.get(i).y,dir[i],checkMap);
						
					}else if(arr.get(i).camNum == 2) {
						
						checkCCTV(arr.get(i).x,arr.get(i).y,dir[i],checkMap);
						checkCCTV(arr.get(i).x,arr.get(i).y,dir[i]+2,checkMap);
					  
					}else if(arr.get(i).camNum == 3) {
					  
						checkCCTV(arr.get(i).x,arr.get(i).y,dir[i],checkMap);
						checkCCTV(arr.get(i).x,arr.get(i).y,(dir[i]+1)%4,checkMap);
						
						
					}else if(arr.get(i).camNum == 4) {
						
						checkCCTV(arr.get(i).x,arr.get(i).y,dir[i],checkMap);
						checkCCTV(arr.get(i).x,arr.get(i).y,(dir[i]+1)%4,checkMap);
						checkCCTV(arr.get(i).x,arr.get(i).y,(dir[i]+2)%4,checkMap);
						
						
					}else {
						
						for(int j=0; j<4; j++)
							checkCCTV(arr.get(i).x,arr.get(i).y,j,checkMap);
					}
				
			}
			
			//System.out.println(temCnt);
			
			if(minResult > M*N - temCnt - cnt - cnt_6) {
				minResult = M*N - temCnt - cnt - cnt_6;
			}
			
			return;		
		}
		
		
		
		if(arr.get(depth).camNum == 1) {
			
			  for(int i=0; i<4; i++) {	
				  dir[depth] = i;
				  dfs(depth+1);
			  }
				
			}else if(arr.get(depth).camNum == 2) {
				
			  for(int i=0; i<2; i++) {		
				  dir[depth] = i;
				  dfs(depth+1);
			  }
			  
			}else if(arr.get(depth).camNum == 3) {
			  
			  for(int i=0; i<4; i++) {	
				  dir[depth] = i;
				  dfs(depth+1);
		      }	
				
				
			}else if(arr.get(depth).camNum == 4) {
				
			  for(int i=0; i<4; i++) {	
				  dir[depth] = i;
				  dfs(depth+1);
		      }	
				
				
			}else {
				dir[depth] = 4;
				dfs(depth+1);
			}
		
		
		
		
	}
	
	
	static void checkCCTV(int x,int y, int curDir,int checkMap[][]) {
		
		int curx = x;
		int cury = y;
		//System.out.println(x+" "+y);
		curx += dx[curDir];
		cury += dy[curDir];
		
		while( ( curx>=0 && curx < M && cury >= 0 && cury < N) ) {
			//System.out.println("check");
			//System.out.println(checkMap[cury][curx]);
			
			if(checkMap[cury][curx] == 6) {				
				break;
			}
			
			if(checkMap[cury][curx] == 0) {
				//System.out.println("check2");
				temCnt ++;
				checkMap[cury][curx] = -1;
			}
			
			
			
			curx += dx[curDir];
			cury += dy[curDir];
		}
		
	}
	
	static class Info{
		int x,y;
		int camNum;
		
		public Info(int x, int y, int camNum) {
			this.x = x;
			this.y = y;
			this.camNum = camNum;			
		}
		
	}

}
