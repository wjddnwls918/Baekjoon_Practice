import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_1377 {

		static int N;
		static int a[] = new int[N+1];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		a = new int[N+1];
		for(int i=1; i<=N; i++) {
			a[i] = Integer.parseInt(in.readLine());
		}
		
				
		bubleSort();
	}
	
	public static void bubleSort() {
		boolean change = false;
		for (int i=1; i<=N+1; i++) {
			change = false;
			for(int j=1; j<=N-1; j++) {
				if(a[j] > a[j+1]) {
					change = true;
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			if( change == false) {
				System.out.println(i);
				break;
			}
		}
	}

}
