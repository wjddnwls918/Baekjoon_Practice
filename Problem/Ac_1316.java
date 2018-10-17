import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1316 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		String str[] = new String[N];
		for(int i=0; i<N; i++) {
			
			str[i] = in.readLine();	
			
		}
		
		boolean alphaFlag[];
		int cnt = 0;
		for(int i=0; i<N; i++) {
			String cur = str[i];
			//System.out.println(cur);
			alphaFlag = new boolean[26];
			
			
			alphaFlag[cur.charAt(0)-'a']= true;
			char tem = cur.charAt(0);			
						
			boolean isOk = true;
			
			if(cur.length() == 1) {
				cnt++;
				continue;
			}
			
			else {
				for(int j=1; j<cur.length(); j++) {
					
					//System.out.println("check");
					//같지 않으면
					if(tem != cur.charAt(j)) {
						
						//System.out.println("check2");
						
						if( alphaFlag[cur.charAt(j)-'a'] ) {
							
							//System.out.println("check3");
							isOk = false;
							break;
						}else {
							
							alphaFlag[cur.charAt(j)-'a'] = true;
							tem = cur.charAt(j);
							
						}
						
					}else {
					
					//같으면 
						while(true) {
							
							if(j+1 >= cur.length() || cur.charAt(j+1) != tem )
								break;
							j++;
						}
						
					}
					//System.out.print(j);
					
				}		
				
			}
			
			
			if( isOk ) {
				//System.out.println(i);
				cnt++;
			}
			
		}
		
		
		System.out.println(cnt);
		
	}

}
