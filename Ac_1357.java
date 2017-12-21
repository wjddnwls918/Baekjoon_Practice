import java.util.Scanner;

public class Ac_1357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String x = in.next();
		String y = in.next();
		
		System.out.println(Rev( Integer.toString(Rev(x)+Rev(y)) ));		
		
	}

	public static int Rev(String x)
	{
		String temp="";
		for(int i=x.length()-1; i>=0; i-- )
		{
			temp += x.charAt(i);
		}
		
		return Integer.parseInt(temp);
	}
}
