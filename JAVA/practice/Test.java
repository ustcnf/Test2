class testDemo
{
	public static void main(String []args)
	{
		
		System.out.println(args[0]);
		//show(args[1]);
	}
	public static void show(Object obj)
	{
		System.out.println(obj);
	}
	public static int Test(int x)
	{
		int count = 0;
		while (x != 0)
		{
			count ++;
			show(count);
			show(x);
			toBin(x);
			x = x & (x - 1);
		}
		return count;
	}
	
	public static void trans(int num, int base, int offset)
	{
		char [] chs = {'0','1','2','3',
					   '4','5','6','7',
					   '8','9','A','B',
				       'C','D','E','F'
									};
		char [] arr = new char [32];
		int pos = arr.length;
		while(num != 0)
		{
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
		
		for(int x = pos ; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.print("\n");
		
		
		
	}
	//十进制转二进制
	
	public static void toBin(int num)
	{
		trans(num, 1, 1);
	}
	//十进制转八进制
	public static void toOct(int num)
	{
		trans(num, 7, 3);
	}
	//十进制转十六进制
	public static void toHex(int num)
	{
		trans(num, 15, 4);
	}
	
	
	
}