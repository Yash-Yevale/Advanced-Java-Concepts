class NumberSorting
{
	public static void main(String args[])
	{
		int number[] = { 55, 40, 80, 65, 71};
		int n = number.length;
		System.out.print("Given List : ");
		for(int i = 0;i < n;i++)
		{
			System.out.print(" " + number[i]);
		}
		
		System.out.println("\n");
		// Sorting Begins
		for(int i = 0;i < n;i++)
		{
			for(int j = i+1; j < n;j++)
			{
				if(number[i] < number[j])
				{
					// Interchange values
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		// Sorting Ends
		System.out.print("Sorted List : ");
		for(int i = 0;i < n;i++)
		{
			System.out.print(" " + number[i]);
		}
		System.out.println("	");
	}
}