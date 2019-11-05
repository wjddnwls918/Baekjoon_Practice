import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Ac_2108 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int maxCnt[] = new int[8001];

		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(in.readLine());
			arr.add(num);

			sum += num;
			maxCnt[num + 4000] += 1;
		}

		Collections.sort(arr);

		// »ê¼úÆò±Õ
		double average = (double)sum/(double)N;
		
		average = Math.floor(average+0.5);
		
		System.out.println((int)average);

		// Áß¾Ó°ª
		System.out.println(arr.get(N/2));

		//ÃÖºó°ª
		
		PriorityQueue<Info> que = new PriorityQueue<>();
		for (int i = 0; i < maxCnt.length; i++) {
			if (maxCnt[i] == 0)
				continue;

			que.add(new Info(i - 4000, maxCnt[i]));
		}

		int prev = -1;
		int val = 0;

		Info cur = que.poll();
		prev = cur.cnt;
		val = cur.num;

		if (!que.isEmpty()) {
			cur = que.poll();
			if (cur.cnt == prev) {
				val = cur.num;				
			}
		}

		System.out.println(val);

		// ¹üÀ§
		System.out.println(arr.get(arr.size() - 1) - arr.get(0));

	}
	
	static class Info implements Comparable<Info> {

		int num, cnt;

		public Info(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Info arg0) {
			if (this.cnt < arg0.cnt)
				return 1;
			else if (this.cnt == arg0.cnt) {

				if (this.num > arg0.num)
					return 1;
				else
					return -1;

			} else
				return -1;

		}
	}

	
}

//¸Þ¸ð¸® ½Ã°£... ÃÖ¾Ç
