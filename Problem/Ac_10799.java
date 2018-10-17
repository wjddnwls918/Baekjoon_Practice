import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ac_10799 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String steelStick = in.readLine();
		Stack<Character> stk = new Stack<>();
		
		int cntOfStick = 0;
		
		for(int i=0; i<steelStick.length(); i++) {
			if(steelStick.charAt(i) == '(')
				stk.push('(');
			else {
				//ÀÚ¸£±â
				if(i-1 >=0 && steelStick.charAt(i-1) == '(') {
					stk.pop();
					cntOfStick += stk.size();
				}else {
					stk.pop();
					cntOfStick += 1;
				}
			}
		}	
		
		System.out.println(cntOfStick);
		
	}

}
