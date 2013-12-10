package czt.learn.Util;

import java.util.List;

public class StaticMethods {

	// To display the List
	public static void showList(List<Object> inList) {
		for (int i=0; i<inList.size(); ++i) {
			System.out.print(inList.get(i).toString() + "\t");
		}
	}
	
	// To display the int array
	public static void showArray(int[] inArr) {
		for (int i=0; i<inArr.length; ++i) {
			System.out.println(inArr[i] + "\t");
		}
	}
	
}
