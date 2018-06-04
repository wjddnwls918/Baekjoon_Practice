import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_1966 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		int N,M;
		String temp[];
		ArrayList<Info> arr;
		for(int x=1; x<=T; x++)
		{
			arr = new ArrayList();
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			temp = in.readLine().split(" ");
			for(int i=0; i<N; i++)
			{
				arr.add(new Info(i, Integer.parseInt(temp[i])) );
			}
			
			int temidx;
			int tempri;
			boolean flag;
			int result =0;
			int time=0;
			while(true)
			{
				flag = false;
				tempri = arr.get(0).priority;
				for(int j=1; j<arr.size(); j++)
				{
					if(arr.get(j).priority > tempri)
					{
						flag = true;
						break;
					}
				}
				
				if(flag)
				{
					temidx = arr.get(0).index;
					tempri = arr.get(0).priority;
					arr.remove(0);
					arr.add(new Info(temidx,tempri));
				}
				else
				{
					temidx = arr.get(0).index;
					tempri = arr.get(0).priority;
					if(temidx == M)
					{
					arr.remove(0);
					time+=1;
					result = time;
					break;
					}
					else
					{
						arr.remove(0);
						time +=1;
					}
				}
				
				
			}
			System.out.println(result);
		}
	}

	static class Info{
		int index,priority;
		public Info(int index, int priority)
		{
			this.index = index;
			this.priority = priority;
		}
	}
}
