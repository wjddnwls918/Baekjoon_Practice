import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1316 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(in.readLine());
		String str[] = new String[num];
		
		int check[];
		int cnt= 0;
		
		
		//-97
		boolean outflag = false;
		for(int i=0; i<num; i++)
		{
			str[i] = in.readLine();
			
			check = new int[26];
		
			int j=0;
			for(; j<str[i].length(); j++)
			{
				//System.out.print((int)str[i].charAt(j)-97+" "); 
				
				if(check[ (int)str[i].charAt(j)-97 ] == 1)
				{
					outflag = true;
					break;
				}
				check[ (int)str[i].charAt(j)-97] = 1;
				char cur = str[i].charAt(j);
				int k = j;
				while(true)
				{
					if(k==str[i].length() )
						break;
					if(cur != str[i].charAt(k))
					{
						j = k-1;
						break;
					}
					k++;
						
				}
				
				
				
			}
			//System.out.println();
			
			if(j == str[i].length())
				cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
