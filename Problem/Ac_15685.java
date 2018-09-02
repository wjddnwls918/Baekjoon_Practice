import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_15685 {
	
	
		static int map[][];

		static ArrayList<Info> arr;
		
		//오 위 왼 아래
		static int dx[] = {1, 0, -1, 0};
		static int dy[] = {0, -1, 0, 1};
		
		static int result;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String tem[];
		
		map = new int[101][101];
		
		for(int i=0; i<N; i++) {
			
			tem = in.readLine().split(" ");
			arr = new ArrayList();
			int x = Integer.parseInt(tem[0]);
			int y = Integer.parseInt(tem[1]);
		    int dir = Integer.parseInt(tem[2]);
		    int gen = Integer.parseInt(tem[3]);
			
			
			arr.add(new Info(x, y, dir));
			map[y][x] = 1;
			arr.add(new Info(x+dx[dir],y+dy[dir],dir));
			map[y+dy[dir]][x+dx[dir]] = 1;
			
			ArrayList<Info> temArr;
			for(int j=0; j<gen; j++) {
				
				temArr = new ArrayList();
				//임시 리스트에 넣고
				for(int k=0; k<arr.size(); k++) {
					temArr.add(arr.get(k));
				}
				
				int curx = arr.get(arr.size()-1).x;
				int cury = arr.get(arr.size()-1).y;
				//System.out.println(j+" "+cury +" "+ curx);
				
				//temArr 생성하고
				for(int k=arr.size()-1; k>=1; k--) {
					
					int curDir = arr.get(k).dir;
					
					curDir = (curDir+1)%4;
					
					curx = curx + dx[curDir];
					cury = cury + dy[curDir];
					
					temArr.add(new Info(curx, cury, curDir));
					
				}
				
				//원본 배열에 넣기
				arr = new ArrayList();
				for(int k=0; k<temArr.size(); k++) {
					arr.add(temArr.get(k));
				}
				
				for(int k=0; k<arr.size(); k++) {
					map[arr.get(k).y][arr.get(k).x] = 1;
				}
				
			}
			
			
		}
		
		result = 0;
		cntSqua();
		System.out.println(result);
		
		/*for(int i=0; i<=6; i++) {
			for(int j=0; j<=6; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}*/
		
	}
	
	static class Info{
		
		int x,y;
		int dir;		
		
		public Info(int x, int y, int dir) {
			
			this.x = x;
			this.y = y;
			this.dir = dir;
			
			
		}		
	}
	
	static void cntSqua() {
		
		for(int i=0; i<=99; i++) {
			for(int j=0; j<=99; j++) {
				if(map[i][j] == 1 && map[i+1][j] == 1 && map[i][j+1] == 1 && map[i+1][j+1] == 1) {
					result++;
				}
			}
		}
	}

}
