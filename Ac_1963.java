import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ac_1963 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		int t = in.nextInt();
		int n[] = new int[t];
		int m[] = new int[t];		
		int d[] = new int[10001];
		int c[] = new int[10001];
		int p[] = new int[10001];
//		Collections.binarySearch
		for(int i=0; i<10001; i++)
		{
			if(is_prime(i))
				p[i]=1;
		}
		for(int i=0; i<t; i++)
		{
			n[i] = in.nextInt();
			m[i] = in.nextInt();
		}
		
		for(int i=0; i<t; i++)
		{
			d[n[i]] = 0;
			c[n[i]] = 1;
			
			que.add(n[i]);
			
			while(!que.isEmpty())
			{
				//System.out.println("check");
				int now = que.remove();
				
				
				for(int j=0; j<4; j++)
				{
					for(int k=0; k<=9; k++)
					{
						int next = change(now,j,k);
						
						if(next !=-1 )
						{
							if(c[next]==0 && p[next]==1)
							{
							que.add(next);
							d[next] = d[now] +1;
							c[next] = 1;
							}
						}
					}
					
				}
				
			}
			
			System.out.println(d[m[i]]);
			que.clear();
			d = new int[10001];
			c = new int[10001];
			
		}	
		
	}
	
	public static int change(int str,int i, int n)
	{
		if(i==0 && n ==0)
			return -1;
		String temp = Integer.toString(str);
		String result="";
		for(int j=0; j<temp.length(); j++)
		{
			if(j ==i)
			{
				result+= Integer.toString(n);
			}
			else
				result+=temp.charAt(j);
		}		
	
		return Integer.parseInt(result);

	}
	
	
	public static boolean is_prime(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i ==0)
				return false;
		}
		return true;
	}

}

//맞긴한데  실행시간이 너무 길게걸려