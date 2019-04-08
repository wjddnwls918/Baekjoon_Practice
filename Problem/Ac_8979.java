import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ac_8979 {

	static int N, K;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");

		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);

		PriorityQueue<CountryInfo> que = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			int num = Integer.parseInt(input[0]);
			int g = Integer.parseInt(input[1]);
			int s = Integer.parseInt(input[2]);
			int b = Integer.parseInt(input[3]);

			que.add(new CountryInfo(num, g, s, b));
		}

		int order = 1;
		CountryInfo pre = que.poll();
		if (pre.num == K) {
			System.out.println(order);
			return;
		} else {

			while (!que.isEmpty()) {
				CountryInfo cur = que.poll();

				/*
				 * System.out.println( "num : " + cur.num + " gold : " + cur.gold + " silver : "
				 * + cur.silver + " bronze : " + cur.bronze);
				 */

				if (pre.gold == cur.gold && pre.silver == cur.silver && pre.bronze == cur.bronze) {
					if (cur.num == K) {
						// System.out.println("check2");
						System.out.println(order);
						break;
					}
				} else {

					order += 1;
					if (cur.num == K) {

						// System.out.println("check3");
						System.out.println(order);
						break;
					}
				}

				pre = cur;
			}

		}

	}

	static class CountryInfo implements Comparable<CountryInfo> {
		int num;
		int gold, silver, bronze;

		public CountryInfo(int num, int gold, int silver, int bronze) {
			this.num = num;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}

		@Override
		public int compareTo(CountryInfo arg0) {
			// TODO Auto-generated method stub
			if (this.gold < arg0.gold) {
				return 1;
			} else if (this.gold == arg0.gold) {

				if (this.silver < arg0.silver) {
					return 1;
				} else if (this.silver == arg0.silver) {

					if (this.bronze < arg0.bronze) {
						return 1;
					} else if (this.bronze == arg0.bronze) {
						return 0;
					} else
						return -1;

				} else
					return -1;

			} else {
				return -1;
			}
		}
	}
}
