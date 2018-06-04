import java.util.Scanner;

public class Ac_14891 {

		static int topNi[][];
		static int result=0;
		static int check[];
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String map[] = new String[4];
		int opcnt;
		
		for(int i = 0; i<4; i++)
		{
			map[i] = in.next();
		}
		
		opcnt = in.nextInt();
		
		int opmap[][] = new int[opcnt][2];
		
		for(int i = 0; i<opcnt; i++)
		{
			for(int j=0; j<2; j++)
			{
				opmap[i][j] = in.nextInt();
			}
		}
		
		topNi = new int[4][8];
		for(int i =0; i<4; i++)
		{
			for(int j =0; j<map[i].length(); j++)
			{
				topNi[i][j] = Integer.parseInt(""+map[i].charAt(j));
			}
		}
		
		for(int i =0; i<opcnt; i++)
		{
			
				//turnRight(opmap[i][0], 0);
				
				check = new int [4];
				//왼
				int j = opmap[i][0] - 1;
				check[j] = 1;
				if( j - 1 >= 0)
				{
					for( int k = j-1; k>=0; k--)
					{
						if(topNi[k][2] != topNi[k+1][6] )
						{
							check[k] = 1;
						}
						else 
							break;
					}
				}
				if( j + 1 < 4)
				{
					for( int k = j+1; k<4; k++)
					{
						if(topNi[k][6] != topNi[k-1][2] )
						{
							check[k] = 1;
						}
						else 
							break;
					}							
				}			
				
														
				if(opmap[i][1] == 1)
				{
					//System.out.println(j);
					turnRight(opmap[i][0]-1);
					
					int flag = 1;					
					if( j - 1 >= 0)
					{
						for( int k = j-1; k>=0; k--)
						{
							if(check[k] == 1 && flag == 1)
							{
								turnLeft(k);
								flag = 2;
								
							}
							else if(check[k] == 1 && flag == 2)
							{
								turnRight(k);
								flag = 1;
							}
						}
					}
					
					flag = 1;
					if( j + 1 < 4)
					{
						for( int k = j+1; k<4; k++)
						{
							if(check[k] == 1 && flag == 1)
							{
								turnLeft(k);
								flag = 2;
								
							}
							else if(check[k] == 1 && flag == 2)
							{
								turnRight(k);
								flag = 1;
							}
						}							
					}
					
				
				
					
				}
				else
				{
					//System.out.println(j);
					turnLeft(opmap[i][0]-1);
					
					int flag = 1;					
					if( j - 1 >= 0)
					{
						for( int k = j-1; k>=0; k--)
						{
							if(check[k] == 1 && flag == 1)
							{
								turnRight(k);
								flag = 2;														
							}
							else if(check[k] == 1 && flag == 2)
							{
								turnLeft(k);
								flag = 1;
							}
						}
					}
					
					flag = 1;
					if( j + 1 < 4)
					{
						for( int k = j+1; k<4; k++)
						{
							if(check[k] == 1 && flag == 1)
							{
								turnRight(k);
								flag = 2;															
							}
							else if(check[k] == 1 && flag == 2)
							{
								turnLeft(k);
								flag = 1;
							}
						}							
					}
								
				
				}						
			
		}
	
		
			if(topNi[0][0] == 1 )
				result+=1;
			if(topNi[1][0] == 1 )
				result+=2;
			if(topNi[2][0] == 1 )
				result+=4;
			if(topNi[3][0] == 1 )
				result+=8;
		
		
			
				System.out.println(result);
		
	}
	

	
	public static void turnRight(int num)
	{		
		
		int temp;		
		temp = topNi[num][7];
		for(int i = 6; i>=0; i--)
			topNi[num][i+1] = topNi[num][i];
		topNi[num][0] = temp;			
		
	}
	
	public static void turnLeft(int num)
	{		
		
		int temp;		
		temp = topNi[num][0];
		for(int i = 1; i<8; i++)
			topNi[num][i-1] = topNi[num][i];
		topNi[num][7] = temp;				
	
	}

}

//개같네 ...
//너무 오래걸렸다.
