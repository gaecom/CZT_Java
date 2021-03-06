package czt.learn.Util;

import java.util.ArrayList;
import java.util.List;

public class Trial {
	
	public static void getInputFromIn() {
		//Test for getting input from user; eg. integer numbers with 'size';
		System.out.print("How many input numbers: ");
		int size = Constants.scanner.nextInt();
		List<Integer> inList = new ArrayList<Integer>();
		for (int i=0; i<size; ++i) {
			inList.add(new Integer(Constants.scanner.nextInt()));
		}
	}
	
	public static void dbiFroList() {
		// This is called 'double brace initialization'
		@SuppressWarnings("serial")
		List<Integer> dbiList = new ArrayList<Integer>() {{
			add(new Integer(1));
			add(new Integer(2));
			add(new Integer(3));
		}};
		
		for (int i=0; i<dbiList.size(); ++i) {
			System.out.println(dbiList.get(i).intValue());
		}
	}
	
	public static void genRandomNumber(int size) {
		for (int i=0; i<size; ++i) {
			int temp = (int) (Math.random()*10 + 1);
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Trial.getInputFromIn();
		//Trial.dbiFroList();
		Trial.genRandomNumber(15);
	}

}
