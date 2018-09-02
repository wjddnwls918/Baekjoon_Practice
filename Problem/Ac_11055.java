import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_11055 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int arr[] = new int[N];
		
		int d[] = new int[N];
		
	
		String tem[];
		tem = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(tem[i]);			
		}
		
		int result=0;
		for(int i=0; i<N; i++) {
			
			d[i] = arr[i];
			
			for(int j=0; j<=i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + arr[i])
					d[i] = d[j] + arr[i];
								
			}
			
			result = result > d[i] ? result : d[i];
		}
		
		System.out.println(result);
		
	}

}
