package gurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questionnumber5 {
public static void main(String[] args) {
	Integer arr[]= {3,1,2,3,4,5,6,2,1,5,6,1,1,1,1};
	ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
	Collections.sort(list1);
	//Arrays.sort(arr);
	for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i));
	}
}
}
