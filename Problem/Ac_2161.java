import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ac_2161 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		Queue<Integer> que = new LinkedList();
		ArrayList<Integer> arr = new ArrayList();
		for(int i=1; i<=N; i++)
			arr.add(i);
		
		int tem;
		while(arr.size() != 1)
		{
			System.out.print(arr.get(0)+" ");
			que.add(arr.remove(0));
			tem = arr.remove(0);
			arr.add(tem);
		}
	
		System.out.println(arr.get(0));
		
	}

}
