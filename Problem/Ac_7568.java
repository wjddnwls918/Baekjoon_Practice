import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_7568 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int w[],h[],score[];
		int N = Integer.parseInt(in.readLine());
		String temp[];		
		w = new int[N];
		h = new int[N];
		score = new int[N];
		Arrays.fill(score, 1);
		for(int i=0; i<N; i++)
		{
			temp = in.readLine().split(" ");
			w[i] = Integer.parseInt(temp[0]);
			h[i] = Integer.parseInt(temp[1]);
		}
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if( i == j)
					continue;
				
				if(w[i] < w[j] && h[i] < h[j])
					score[i]+=1;
				
			}
		}
		for(int i=0; i<N; i++)
			System.out.println(score[i]);
		
	}

}
