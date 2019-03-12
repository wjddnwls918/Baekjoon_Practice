import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ac_7785 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		Set<String> set = new HashSet();
			
		String temp[];
		for(int i=0; i<n; i++) {
			temp = in.readLine().split(" ");
		
			if(temp[1].equals("enter")) {
				set.add(temp[0]);
			}else {							
				set.remove(temp[0]);				
			}
		}
				
		ArrayList<String> list = new ArrayList<>();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {			
			list.add(itr.next());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
	}

}

//TreeSet은 왜 remove가 안먹히지 ??
