package czt.learn.Util;

import java.util.List;

public class StaticMethods {

	// To display the List
	public static void showList(List inList) {
		for (int i=0; i<inList.size(); ++i) {
			System.out.print(inList.get(i).toString() + "\t");
		}
	}
	
}