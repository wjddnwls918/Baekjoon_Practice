import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


//텀프로젝트
public class Ac_9466 {

		static int n;
		static int arr[];
		static int check[];
		
		static List<Integer> checkList;
		static int remem;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=0; x<T; x++) {
			
			n = Integer.parseInt(in.readLine());
			arr= new int[n+1];
			check = new int[n+1];
			String temp[] = in.readLine().split(" ");
			for(int i=1; i<=n; i++) {
				arr[i] = Integer.parseInt(temp[i-1]);
			}
			
			for(int i=1; i<=n; i++) {
				checkList = new ArrayList();
				boolean isOk = false;
				if(check[i] != 1) {
					remem = i;
					checkList.add(i);
					isOk = dfs(i);
				}			
				
				if(isOk) {
					for(int j=0; j<checkList.size(); j++) {
						check[checkList.get(j)] = 1;
					}
				}
				System.out.println(isOk);
			}
			
			int cnt = 0;
			for(int i=1; i<=n; i++) {
				if(check[i] == 1)
					cnt++;
			}
			System.out.println(cnt);
			
		}
	}

	public static boolean dfs(int idx) {
	
		//처음이고 같은경우
		if(checkList.size() == 1  && idx == arr[idx]) {
			return true;
		}else if(idx == arr[idx]) {
			return false;
		}else {
			if(arr[idx] == remem)
				return true;
			else {
				checkList.add(arr[idx]);
				dfs(arr[idx]);
			}
				
		}
		return false;
	}
		
}
