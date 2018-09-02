import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_15684 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
			
			String str[] = new String[5];
			int maxLen = 0;
			for(int i=0; i<5; i++) {
				str[i] = in.readLine();
				if(maxLen < str[i].length())
					maxLen = str[i].length();
			}
			
			
			System.out.print("#"+x+ " ");
			int startX=0,startY=0;
			
			for(int i=0; i<maxLen; i++) {
				
				for(int j=0; j<5; j++) {
					
					if(i >= str[j].length())
						continue;
					
					System.out.print(str[j].charAt(i));
				}				
			}
			System.out.println();
			
		}
	}

}
