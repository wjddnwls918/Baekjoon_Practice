import java.util.Scanner;
import java.util.Stack;

public class Ac_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		in.nextLine();		
		String temp[];
		String str = "";
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=0; i<n; i++)
		{
			str = in.nextLine();
			temp = str.split(" ");
			if(temp[0].equals("push"))
			{
				stk.push(Integer.parseInt(temp[1]));				
			}
			else if( temp[0].equals("top"))
			{
				System.out.println(stk.peek());
			}
			else if( temp[0].equals("pop"))
			{
				if(!stk.isEmpty())
				System.out.println(stk.pop());
				else
				System.out.println(-1);
			}
			else if( temp[0].equals("size"))
			{
				System.out.println(stk.size());
			}
			else
			{
				if(stk.isEmpty())
				System.out.println(1);
				else
				System.out.println(0);
			}
		}
	
	}
}
