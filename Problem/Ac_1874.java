import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Ac_1874 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		Stack<Integer> stk = new Stack();
		
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(in.readLine());
		}
		
			int j = 0;
		
			int temp;
			for(int i=1; i<=n; i++)
			{
				stk.push(i);
				
				
				System.out.println("+");
				
				temp = stk.peek();
				if(temp == arr[j])
				{
					
				}
				
				
				
				
			}
			
			
		
		
	}

}
