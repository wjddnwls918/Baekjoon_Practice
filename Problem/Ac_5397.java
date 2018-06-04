import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ac_5397 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		Stack<Character> result = new Stack<>();
		Stack<Character> temp = new Stack();
		for(int x=1; x<=T; x++)
		{
			
			String str = in.readLine();
			for(int i =0; i<str.length(); i++)
			{
				if(str.charAt(i) == '-')
				{
					if(!result.isEmpty())
						result.pop();
				}
				else if( str.charAt(i) == '<')
				{
					if(!result.isEmpty())
						temp.add(result.pop());
				}
				else if( str.charAt(i) == '>')
				{
					if(!temp.isEmpty())
						result.add(temp.pop());					
				}
				else
				{
					result.add(str.charAt(i));
				}
			}
			while(!result.isEmpty())
			{
				temp.add(result.pop());
			}
			
			while(!temp.isEmpty())
			{
				System.out.print(temp.pop());
			}			
			System.out.println();
		}
		
	}	

}
