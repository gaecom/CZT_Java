package czt.learn.DZGZ;

import java.util.HashMap;

public class SmartSorting123 {
	
	public static void byPrimeNumber(String input) {
		// Use a HashMap to map from 1,2,3 to a distinct prime number;
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		hash.put(new String("1"), new Integer(2));
		hash.put(new String("2"), new Integer(3));
		hash.put(new String("3"), new Integer(5));
		
		// Then multiply all these prime numbers according to the input;
		int res = 1;
		for (int i=0; i<input.length(); ++i) {
			res *= hash.get(input.substring(i, i+1)).intValue();
		}
		
		// 
		StringBuffer sb = new StringBuffer();
		while (res % 2 == 0) {
			sb.append("1");
			res /= 2;
		}
		while (res % 3 == 0) {
			sb.append("2");
			res /= 3;
		}
		while (res % 5 == 0) {
			sb.append("3");
			res /= 5;
		}
		System.out.println("======");
		System.out.println(input);
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6 '1', 6 '2', 6 '3'
		String s1 = "123132213231321312";
		SmartSorting123.byPrimeNumber(s1);
	}

}
