import java.util.Scanner;

public class Ac_10942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
		int m = in.nextInt();
		
		while(m-->0)
		{
			int s = in.nextInt();
			int e = in.nextInt();
			
			if(is_pel(s,e,arr))
			System.out.println(1);
			else
			System.out.println(0);
		}
	}

	public static boolean is_pel(int s, int e,int arr[])
	{		
			while( s < e)
			{
				if(arr[s-1]!=arr[e-1])
					return false;
				s++;
				e--;				
			}	
		
		return true;
	}
}


//정답인데 시간 욀케 오래걸려
