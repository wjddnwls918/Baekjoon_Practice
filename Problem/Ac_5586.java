import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5586 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		
		int jCnt=0,iCnt=0;
		for(int i=0; i<=input.length()-3; i++) {
			
			String cur = input.substring(i,i+3);
			
			if(cur.equals("JOI") ) {
				jCnt += 1;
			}
			
			if(cur.equals("IOI")) {
				iCnt += 1;
			}
		}
		
		System.out.println(jCnt);
		System.out.println(iCnt);
		
	}	

}
