import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Ac_9012 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String temp="";
	    boolean result;
		Stack <Character>stk = new Stack();
		char ch =0;
		while(n-- >0)
		{
			result = true;
			temp = in.nextLine();			
			
			for(int i=0; i<temp.length(); i++)
			{
				if(temp.charAt(i) == '(')
				{
					stk.push('(');
				}			
				else if( temp.charAt(i) == ')')
				{	
					if(stk.isEmpty())
					{
						result =false;
						break;
					}
					else if( stk.peek() == '(')
					{						
						stk.pop();
					}												
				}				
			}			
			
			if(stk.size()>0)
				result =false;
			
			if( result)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			stk.clear();

		}
	}

}


//Á¤´äÀÎµ¥ // ¿ßÄÉ Çì¸ÌÁö ..

//9836kb , 123ms