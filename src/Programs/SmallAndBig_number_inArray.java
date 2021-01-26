package Programs;

public class SmallAndBig_number_inArray {
	public static void main(String args[])
	{
		SmallAndBig_number_inArray.large_num();
		SmallAndBig_number_inArray.small_num();
	}
	public static void small_num()
	{
		int[][] abc= {{9,4,5},{33,34,22},{33,42,10}};
		int min=abc[0][0];
		
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
			}
			}
			
		}
			System.out.println("minimum num is"+" "+ min);
		
		}
	public static void large_num()
	{
		int[][] abc= {{9,4,5},{33,34,22},{33,42,10}};
		int max=abc[0][0];
		
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
			}
			}
			
		}
		System.out.println("maximum num is"+" "+ max);
		
		}
	}


