import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_5014 {

		static int F,S,G,U,D;
		static int b[];
		static int check[];
		static boolean canArrive;
		static int result;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		F = Integer.parseInt(temp[0]);
		S = Integer.parseInt(temp[1]);
		G = Integer.parseInt(temp[2]);
		U = Integer.parseInt(temp[3]);
		D = Integer.parseInt(temp[4]);
		
		b = new int[F+1];
		check = new int[F+1];	
		
		
		canArrive = false;
		findStartLink();
		
		if(canArrive) {
			System.out.println(result);
		} else {
			System.out.println("use the stairs");
		}
		
	}
	
	public static void findStartLink() {
		
		Queue<Info> que = new ArrayDeque<>();
		que.add(new Info(S, 0));
		
		while(!que.isEmpty()) {
			Info temp = que.poll();
			
			if(temp.stair == G) {
				canArrive = true;
				result = temp.cnt;				
				break;
			}
			
			//À§ 
			int up = temp.stair + U;
			if(up <= F && check[up] != 1) {
				check[up] = 1;
				que.add(new Info(up, temp.cnt+1));
			}
			//¾Æ·¡
			int down = temp.stair - D;
			if(down >= 1 && check[down] != 1) {
				check[down] = 1;
				que.add(new Info(down,temp.cnt+1));
			}
		}
	}
	
	public static class Info {
		int stair;
		int cnt;
		public Info(int stair, int cnt) {
			this.stair = stair;
			this.cnt = cnt;
		}
	}

}
