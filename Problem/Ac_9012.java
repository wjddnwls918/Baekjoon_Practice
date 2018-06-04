import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ac_9012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		String str;
		Stack<Character> stk;
		boolean result;
		for(int x=1; x<=t; x++)
		{
			str = in.readLine();
			
			stk = new Stack();
			
			
			result = true;
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i) == '(')
				{
					stk.push('(');
				}
				else if(str.charAt(i) == ')')
				{
					if(stk.isEmpty())
					{
						result = false;
						break;
					}
					char temp = stk.pop();
					if(temp != '(')
					{
						result =false;
						break;
					}
					
				}
			}
			
			if(!stk.isEmpty())
				result = false;
				
			if(result)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		

	}

}
