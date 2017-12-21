import java.util.*;

public class Ac_2839 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,cnt1=0,cnt2=0,temp = 0,case1=0,case2=0;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		case1 = n;
		case2 = n;
		
		while (case1 !=0  && case1 !=-1)
		{
			if ( case1 %3 == 0)
			{
			temp = n/3;
			case1 = n%3;
			cnt1 += temp;
			}
			else
			{
				case1 = -1;
			}
			
			//System.out.println(case1);
		}
		
		System.out.println(cnt1 + " result :" + case1);
		
		temp =0;
		while(case2 !=0  && case2 !=-1)
		{
			//System.out.println("Test");
			//System.out.println(18 / 5);
			temp = n/5;
			System.out.println(temp);
			case2 = case2%5;
			cnt2 +=temp;
			System.out.println("case2 ch1 : " +case2);
			if( case2 % 3 == 0 && case2 !=0)
			{
				temp = case2/3;
				System.out.println(temp);
				case2 = case2%3;
				cnt2 += temp;
				System.out.println("case2 ch2 : "+case2);
			}
			if( case2 != 0)
			{
				case2 = -1;
			}
		}
		
		System.out.println(cnt2 + " result :" + case2);
		
		
		if ( case1 != -1 && case2 != -1)
		{
			if(cnt1 > cnt2)
				System.out.println(cnt2);
			else
				System.out.println(cnt1);
		}
		else if (case1 == -1 && case2 != -1)
		{
			System.out.println(cnt2);
		}
		else if (case2 == -1 && case1 != -1)
		{
			System.out.println(cnt1);
		}
		else
		{
			System.out.println(-1);
		}
		
	}

}
