import java.util.Scanner;

public class Ac_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,g;
		a = in.nextInt();
		b = in.nextInt();
		
		g =getg(a,b);
		
		System.out.println(g);
		System.out.println(a*b/g);
		
	}
	public static int getg(int a,int b)
	{
		if(a %b ==0)
			return b;
		else
		return getg(b, a%b);
		
	}

}
