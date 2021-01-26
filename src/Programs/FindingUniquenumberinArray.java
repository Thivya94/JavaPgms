package Programs;

import java.util.ArrayList;

public class FindingUniquenumberinArray {
public static void main(String[] args) {
		
		int a[]= {9,3,7,4,2,1,2,3,9,3,2};//commit
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) 
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				
				
				System.out.println(a[i]+"-"+k);
				if(k==1)
				{
					System.out.println(a[i] + " "+"is the unique number");
				}
			}
			
		}
		
		
	}
	}





