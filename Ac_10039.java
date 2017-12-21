import java.util.*;
public class Ac_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		
		if (a < 40)
			a= 40;
		if (b < 40)
			b= 40;
		if ( c < 40)
			c= 40;
		if ( d < 40)
			d= 40;
		if ( e < 40)
			e= 40;
		
		System.out.println( (a+b+c+d+e) / 5);
				
	}

}
