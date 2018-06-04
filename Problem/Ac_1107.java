import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1107 {

		static int Button[];
		static int result;
		static int to;
		static boolean isnext;
		static int cur;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		to = Integer.parseInt(in.readLine());
		int malcnt = Integer.parseInt(in.readLine());
		Button = new int[10];
		
		if(malcnt != 0)
		{
			String temp[] = in.readLine().split(" ");
			for(int i=0; i<malcnt; i++)
			{
				Button[Integer.parseInt(temp[i])] = 1;
			}
		}
		
		boolean leftok,rightok;
		leftok =false;
		rightok = false;
		int left=to,right=to;
		cur=100;
		
		while(true)
		{			
			if (to == cur)
			{
				break;
			}
			
			result = 0;
			
			
			
			
			isnext = true;
			leftok = check(left);
			System.out.println("left : "+left+"leftok : ");
			if(leftok)
			{				
				if(isnext)
					result+= Math.abs(left-to);
				break;
			}
			
			isnext = true;
			rightok = check(right);
			System.out.println("right : "+right+" rightok : "+rightok);
			if(rightok)
			{			
				if(isnext)
					result+= Math.abs(right-to);
				break;		
			}
			
			
			
			
			left -= 1;
			right += 1;
			
			
			
		}
		
		System.out.println(result);
		
	}
	
	public static boolean check(int num)
	{
		String tem;
		tem = Integer.toString(num);
		
		for(int i=0; i<tem.length(); i++)
		{
			if( Button[Integer.parseInt(""+tem.charAt(i))] == 1 )
			{
				return false;
			}
				
		}
		if(Math.abs(to-cur) < tem.length())
		{
			isnext = false;
			result += to-num;
		}
		else
		{
			result += tem.length();
		}
		
		return true;
	}

}

//킁 ... 리모컨 
