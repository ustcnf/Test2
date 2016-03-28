class ArrayFind
{
	public static void main(String[] args)
	{
	int [] arr = new int []{1 , 3 ,4 , 5,6 ,8 ,10 };
		int index = getIndex_2(arr , 2);
		System.out.println("index = "+ index);
	}
	//获取角标
/* 	public static int getIndex(int [] arr, int key)
	{
		for(int x= 0 ; x < arr.length ; x++)
		{
			if(arr [x] == key)
				return x;
		}
		return -1;
	} */
	//Find in order sort
/* 	public static int halfSerch(int [] arr, int key)
	{
		int min , max , mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max)/2;
		while (arr[mid] != key )
		{
			if( key > arr[mid])
				min = mid + 1;
			else if
				max = mid - 1;
			mid = (min + max)/2;
			if( min > max)
			return -1;
				
		}
		return mid;
	} */
	//Way 2 to halfSerch :different : The judge of condition
	/* public static int halfSerch_2(int [] arr, int key)
	{
		int min = 0, max = arr.length - 1, mid ;
		while (min <= max)
		{
			mid = (min + max)/2;
			if(arr[mid] < key)
				min = mid + 1;
			else if(arr[mid] > key)
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	} */
	
	//In order sequence to get index positon which the new element wants insert in
	public static int getIndex_2(int [] arr, int key)
	{
		int min = 0, max = arr.length - 1, mid ;
		while (min <= max)
		{
			mid = (min + max)/2;
			if(arr[mid] < key)
				min = mid + 1;
			else if(arr[mid] > key)
				max = mid - 1;
			else
				return mid;
		}
		return min;    //The differet
	}
}