import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1547 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(in.readLine());
		
		Info info[] = new Info[3];
		info[0] = new Info(1,true);
		info[1] = new Info(2,false);
		info[2] = new Info(3,false);
		
		String temp[];
		int swap;
		boolean swap2;
		for(int i=0; i<M; i++)
		{
			temp = in.readLine().split(" ");
			//포지
			swap = info[Integer.parseInt(temp[1])-1].cupnum;
			info[Integer.parseInt(temp[1])-1].cupnum = info[Integer.parseInt(temp[0])-1].cupnum;
			info[Integer.parseInt(temp[0])-1].cupnum = swap;
			
			swap2 = info[Integer.parseInt(temp[1])-1].isBall;
			info[Integer.parseInt(temp[1])-1].isBall = info[Integer.parseInt(temp[0])-1].isBall;
			info[Integer.parseInt(temp[0])-1].isBall = swap2;
		}
		
		int result=0;
		for(int i=0; i<3; i++)
		{
			if(info[i].isBall == true)
			{
				result =info[i].cupnum;
			}
		}
		System.out.println(result);
	
	}
	static class Info
	{
		int cupnum;
		boolean isBall;
		public Info(int cupnum,boolean isBall)
		{
			this.cupnum = cupnum;
			this.isBall = isBall;
		}
	}

}

//문제설명이 이상함 ..
