package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingSmallestNumber {
	
	public static int getSmallest() {
		Integer[] a = { 3, 2, 1 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		return a[0];
	}
	
	public static int getSmallestUsingArrays()
	{
		Integer[] a = { 2,0,3, 2, 1 };
		Arrays.sort(a);
		return a[0];
		
		
	}
	
	public static int getSmallest(Integer[] a){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(0);  
		return element;  
		}  

	public static void main(String[] args) {
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55}; 
		
		int value = FindingSmallestNumber.getSmallest();
		System.out.println(value);
		
		int value_fromArrays = FindingSmallestNumber.getSmallestUsingArrays();
		System.out.println(value_fromArrays);
		
		
		System.out.println("Smallest: "+FindingSmallestNumber.getSmallest(a));
		System.out.println("Smallest: "+FindingSmallestNumber.getSmallest(b));  

	}
}



