import java.util.Scanner;

public class Ac_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// 1 <=e <=15 , 1 <=s <=28 1<=m<=19
		
		int e =in.nextInt();
		int s = in.nextInt();
		int m = in.nextInt();
		
		int ce=0,cs=0,cm =0;
		int cnt=0;
		while( !(e == ce && s ==cs && m ==cm) )
		{
			
			if(ce +1 >15)
				ce =1;
			else
				ce ++;
			
			if(cs +1 > 28)
				cs = 1;
			else 
				cs++;
			
			if(cm +1 > 19)
				cm =1;
			else 
				cm++;
//			System.out.println("check");
			cnt++;			
		}				
		System.out.println(cnt);
		
	}

}

//정답인데 좀 길다


