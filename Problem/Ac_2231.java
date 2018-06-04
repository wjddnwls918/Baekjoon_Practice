import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2231 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		int result = 0;
	
		int temp;
		for(int num=1; num <= 1000000; num++)
		{
			temp = 0;
			temp += num;
			String str = Integer.toString(num);
			for(int i=0; i<str.length(); i++)
				temp += Integer.parseInt(str.charAt(i)+"");
			
			if(temp == N)
			{
				result = num;
				break;
			}		
		}
		System.out.println(result);
	}

}
