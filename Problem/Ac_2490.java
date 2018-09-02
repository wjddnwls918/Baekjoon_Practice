import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ac_2490 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			int a=0;
			for(int j=0; j<4; j++)
			{
				a += in.nextInt();
			}
			if( a == 0)
				System.out.println("D");
			else if( a == 1)
				System.out.println("C");
			else if( a == 2)
				System.out.println("B");
			else if( a == 3)
				System.out.println("A");
			else
				System.out.println("E");
		}
		
	}

}
