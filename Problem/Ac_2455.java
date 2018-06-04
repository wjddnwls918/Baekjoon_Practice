import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2455 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cur=0,max=-1;
		String temp[];
		for(int i=0; i<4; i++)
		{
			temp = in.readLine().split(" ");
			cur -= Integer.parseInt(temp[0]);
			cur += Integer.parseInt(temp[1]);
			if( max < cur)
				max = cur;
		}
		System.out.println(max);
	}
}
