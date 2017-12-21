import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ac_1697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		
		int check[] = new int[100001];
		int dist[] = new int[100001];
		check[n]= 1;
		que.add(n);
		
		while(!que.isEmpty())
		{
			int now = que.peek();
			que.poll();
			
			if( now -1 >= 0)
			{
				if(check[now-1] == 0)
				{
					que.add(now-1);
					check[now-1] = 1;
					dist[now-1] = dist[now] +1;
				}
			}
			if( now +1 <= 100000)
			{
				if(check[now+1] == 0)
				{
					que.add(now+1);
					check[now+1] = 1;
					dist[now+1] = dist[now] +1;
				}
			}
			
			if( now *2 <= 100000)
			{
				if(check[now*2] == 0)
				{
					que.add(now*2);
					check[now*2] = 1;
					dist[now*2] = dist[now] +1;
				}
			}			
		}
		System.out.println(dist[k]);
		
	}

}

//���� .
/*
	1. ������ ���� 1�ʺ��� ���� 
	2. �ּ� ���ϴ� ����
	3. ���� -> ���� 
	   ������ ����ġ == 1


*/