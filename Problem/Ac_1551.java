import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_1551 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList();
		ArrayList<Integer> tem = new ArrayList();
		
		int N,K;
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		K = Integer.parseInt(temp[1]);
		temp = in.readLine().split(",");
		for(int i=0; i<N ;i++)
		{
			arr.add(Integer.parseInt(temp[i]));
		}
	
		for(int i=0; i<K; i++)
		{
			for(int j=0; j<arr.size()-1; j++)
			{
				tem.add(arr.get(j+1)-arr.get(j));
			}
			arr = new ArrayList();
			for(int j=0; j<tem.size(); j++)
			{
				arr.add(tem.get(j));
			}
			tem = new ArrayList();
		}
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.print(arr.get(i));
			if(i == arr.size()-1)
				System.out.println();
			else
				System.out.print(",");
		}
		
		
	}

}
