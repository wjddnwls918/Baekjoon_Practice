import java.util.*;
public class Ac_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		String a;
		Scanner in = new Scanner(System.in);
		
		t = in.nextInt();
		
		for(int i=0; i<t ; i++)
		{
		a = in.next();
		System.out.println(Integer.parseInt((a.charAt(0)+""))+Integer.parseInt(a.charAt(2)+""));
		}
		
	}

}
