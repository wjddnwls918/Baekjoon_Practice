import java.util.Scanner;

public class Ac_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n[] = new String[8];
		String flag[]= new String[8];
		int check[] = {0,1},cnt=0;
		
		int pos=0;
		for(int i=0; i<8; i++)
		{		
				n[i] = in.next();
				flag[i] ="";
		}
		
		for(int i=0; i<8; i++)
		{
			if(i%2 == 0)
				pos =0;
			else
				pos =1;
			for(int j=0; j<n[i].length(); j++)
			{				
				flag[i] += check[pos];				
				if(pos ==1)
					pos =0;
				else
					pos =1;
				
				if(Integer.parseInt(""+flag[i].charAt(j))==0 && n[i].charAt(j) == 'F')
				{
					cnt++;
				}
			}
		}
		
		
		System.out.println(cnt);
	
	}

}
//정답인데 다른사람에 비해 기네 918