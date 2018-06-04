import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1526 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		String tem;
		boolean isok;
		for(int i=N; i>=0; i--)
		{
			tem = Integer.toString(i);
			isok = true;
			for(int j=0; j<tem.length(); j++)
			{
				if(tem.charAt(j)!= '7' && tem.charAt(j)!= '4')
				{
					isok = false;
					break;
				}
			}
			if(isok)
			{
				System.out.println(tem);
				break;
			}
		}
	}

}
