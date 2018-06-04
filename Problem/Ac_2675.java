import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2675 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		int R;
		String temp[];
		String str;
		for(int i=1; i<=t; i++)
		{
			temp = in.readLine().split(" ");
			R = Integer.parseInt(temp[0]);
			str = temp[1];
			
			
			for(int j=0; j<str.length(); j++)
			{
				for(int k=0; k<R; k++)
				{
					System.out.print(str.charAt(j));
				}				
			}
			System.out.println();
		}
		
	}	

}
