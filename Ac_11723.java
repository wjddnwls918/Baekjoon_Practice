import java.util.Scanner;

public class Ac_11723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		String str="";
		String temp[];
		int num = 0;
		while( n-- > 0)
		{
//			System.out.println(1);
			str = in.nextLine();
			temp = str.split(" ");
			
			if(temp[0].equals("add"))
			{
				
				num |= (1 << Integer.parseInt(temp[1])-1);
			}
			else if(temp[0].equals("remove"))
			{
				num &= ~(1<< Integer.parseInt(temp[1])-1);
			}
			else if(temp[0].equals("check"))
			{				
					
				
				if( (num & (1<< Integer.parseInt(temp[1])-1)) == Math.pow(2, Integer.parseInt(temp[1]) -1) )
					System.out.println(1);
				else
					System.out.println(0);
				//System.out.println( (num & (1<< Integer.parseInt(temp[1])-1)) );					
				
					
			}
			else if(temp[0].equals("toggle"))
			{
				if( (num & (1<< Integer.parseInt(temp[1])-1) )== Math.pow(2, Integer.parseInt(temp[1]) -1) )
				{
					num &= ~(1<< Integer.parseInt(temp[1])-1);
					
				}
				else
				{
					num |= (1 << Integer.parseInt(temp[1])-1);
				}
			}
			else if(temp[0].equals("all"))
			{
				num |= ~0;
			}
			else if(temp[0].equals("empty"))
			{
				num &= 0;
			}
		}
	}

}
