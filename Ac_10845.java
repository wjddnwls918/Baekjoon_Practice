import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ac_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String temp ="";
		Queue<Integer> que = new LinkedList<>();
		int remem=0;
		while(n-- >0)
		{
			temp = in.nextLine();
			String arr[] = temp.split(" ");
			
			if(arr[0].equals("push"))
			{
				que.add(Integer.parseInt(arr[1]));
				remem = Integer.parseInt(arr[1]);
			}
			else if(arr[0].equals("pop"))
			{
				if(que.peek()!=null)
				System.out.println(que.poll());
				else
				System.out.println(-1);
			}
			else if(arr[0].equals("size"))
			{
				System.out.println(que.size());				
			}
			else if (arr[0].equals("empty"))
			{
				if(que.isEmpty())
				{
					System.out.println(1);
				}
				else
					System.out.println(0);
			}
			else if (arr[0].equals("front"))
			{
				if(que.peek()!=null)
				System.out.println(que.peek());
				else
				System.out.println(-1);
			}
			else if ( arr[0].equals("back"))
			{
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(remem);
			}
			else
				System.out.println("error!");
			
		}
	}

}

//맞긴 맞았는데 조금 길다 실행시간도 
