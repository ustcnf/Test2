//选择排序，每次选出最小的放在开头，依次选出最小的。
class selectSort
{
	public static void main(String[] args)
	{
		int [] arr = new int []{3 , 1 ,6 ,8};
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}
	public static void selectSort(int [] arr)
	{
		for(int x=0; x< arr.length ; x++)
			{
				for(int y=x + 1; y< arr.length; y++)
				{
					if(arr[x] > arr[y])
					{
						int temp = arr[x];
						arr[x] = arr [y];
						arr[y] = temp;
					}
					
				}
			}
	}
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x = 0; x < arr.length; x++)
		{
			if(x != arr.length - 1)
				System.out.print(arr[x] + ", ");
			else
				System.out.println(arr[x] + "]");
		}
	}
}



