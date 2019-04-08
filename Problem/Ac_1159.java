import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeMap;

public class Ac_1159 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<N; i++) {
			char cur = in.readLine().charAt(0);
			if(map.containsKey(cur)) {
				map.put(cur, map.get(cur) + 1);
			} else {
				map.put(cur, 1);
			}
		}
		
		Iterator<Character> itr = map.keySet().iterator();
		boolean isOk = false;
		while(itr.hasNext()) {
			char cur = itr.next();
			int curCnt = map.get(cur);
			if(curCnt >= 5) {
				isOk = true;
				System.out.print(cur);
			}
		}
		
		if(!isOk)
			System.out.println("PREDAJA");
		
		System.out.println();
	}

}
