import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10250 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
			
			int H,W,N;
			String tem[] = in.readLine().split(" ");
			H = Integer.parseInt(tem[0]);
			W = Integer.parseInt(tem[1]);
			N = Integer.parseInt(tem[2]);
			
			int cnt= 0;
			String roomNum = "";
			for(int i=1; i<=W; i++) {
				for(int j=1; j<=H; j++) {
					
					cnt++;
					
					if(cnt == N) {
						
						
						roomNum += j;
						if(i<10)						
							roomNum+=("0"+i);
						else
							roomNum+=i;
						break;
					}
				}
				if(!roomNum.equals(""))
					break;
			}
			
			System.out.println(roomNum);
			
		}
		
		
	}

}
