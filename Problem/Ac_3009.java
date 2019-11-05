import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ac_3009 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		HashMap<Integer,Integer> setx = new HashMap<>();
		HashMap<Integer,Integer> sety = new HashMap<>();
		for(int i=0; i<3; i++) {
			
			input = in.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			if(setx.containsKey(x)) {
				setx.put(x, setx.get(x)+1);
			} else {
				setx.put(x, 1);
			}
			
			if(sety.containsKey(y)) {
				sety.put(y, sety.get(y)+1);
			} else {
				sety.put(y, 1);
			}
			
		}
		
		int resultx=-1, resulty=-1;
		
		Iterator<Integer> itr = setx.keySet().iterator();
		while(itr.hasNext()) {
			int cur = itr.next();			
			if(setx.get(cur)== 1) {
				resultx = cur;
			}
		}
		
		itr = sety.keySet().iterator();
		while(itr.hasNext()) {
			int cur = itr.next();
			
			if(sety.get(cur)== 1) {
				resulty = cur;
			}
		}
		
		System.out.println(resultx +" "+resulty);
		
	}

}
