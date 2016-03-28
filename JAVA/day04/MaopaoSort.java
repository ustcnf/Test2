//冒泡排序，两两比较，最值出现在最后
class MaopaoSort
{
	public static void main(String[] args)
	{
		int [] arr = new int []{3 , 1 ,6 ,8, 5};
		printArray(arr);
		MaopaoSort(arr);
		printArray(arr);
	}
	public static void MaopaoSort(int [] arr)
	{
		for(int x=0; x < arr.length - 1 ; x++)
			{
				for(int y= 0; y< arr.length - x -1; y++)
				{
					if(arr[y] > arr[y + 1])
					{
						int temp = arr[y];
						arr[y] = arr [y+1];
						arr[y+1] = temp;
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

