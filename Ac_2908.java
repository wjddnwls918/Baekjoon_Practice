import java.util.Scanner;

public class Ac_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();		
		String temp1, temp2;
		temp1 = Integer.toString(a);
		temp2 = Integer.toString(b);		
		String rtemp1="";
		String rtemp2="";
		for(int i=temp1.length()-1; i>=0; i--)
		{
			rtemp1+=temp1.charAt(i);
			rtemp2+=temp2.charAt(i);			
		}		
		System.out.println(Integer.parseInt(rtemp1)> Integer.parseInt(rtemp2)?Integer.parseInt(rtemp1):Integer.parseInt(rtemp2));
	}

}
