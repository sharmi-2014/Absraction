package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

public static void main(String[] args) {
	List<String>lst= new ArrayList<String>();
	lst.add("Red");
	lst.add("Green");
	lst.add("Blue");
	lst.add("Yellow");
	lst.add("Brown");

	
	System.out.println(lst);
	for(int i=lst.size()-1;i>=0;i--) {
		System.out.println(lst.get(i));

	}
}
}