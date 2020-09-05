package notyet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class PS_1541 {

	static BufferedReader in;
	
	static ArrayList<Integer> arr;
	
	static ArrayList<Character> operator;
	

	
	static int min;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		in = new BufferedReader(new InputStreamReader(System.in));
		
		makeInput();		
		
		min = 987654321;
				
		
		findMin();
		
		
		System.out.println(min);
		
	}
	
	public static void makeInput() throws Exception {
		
		String input = in.readLine();
		
		String numbers[] = input.split("\\+|-");
		
		//System.out.println(numbers.length);
		
		arr = new ArrayList<>();
		
		for(int i=0; i<numbers.length; i++) {
			//System.out.println(numbers[i]);
			
			arr.add(Integer.parseInt(numbers[i]));
		}
		
		operator = new ArrayList<>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '+' || input.charAt(i) == '-') {
				operator.add(input.charAt(i));				
			}
		}
		
		
	}
	
	public static void findMin() {
		
		
		for(int i=0; i<operator.size(); i++) {
			int sum = 0;
			
			int temp= 0;
			if(operator.get(i) == '+') {
				temp = arr.get(i) + arr.get(i+1);
			}
			else {
				temp = arr.get(i) - arr.get(i+1);
			}
			
			sum += temp;
			
			//to left
			for(int j=i-1; j>=0; j--) {
				if(operator.get(j) =='+') {
					sum = arr.get(j) + sum;
				}else {
					sum = arr.get(j) - sum;
				}
			}
			
			//to right
			for(int j=i+1; j<operator.size(); j++) {
				if(operator.get(j) =='+') {
					sum += arr.get(j+1);
				}else {
					sum -= arr.get(j+1);
				}
			}
			
			if(min > sum) {
				min = sum;
			}
		}
		
	}

}

//Æ²¸²
