class numConvertNew
{
	public static void main(String[] args)
	{
		toOct(-47);
	}
	//ten --->> bin
	public static void toBin(int num)
	{
		trans(num , 1 , 1);
	}

	//ten --->>hex
	public static void toHex(int num)
	{
		trans(num , 15 , 4);
	}
	
	//ten ---> Oct
	public static void toOct(int num)
	{
		trans(num , 7 , 3);
	}




	// num :transfer num; base: binary? hex? ; offset :
	public static void trans(int num,int base , int offset)
	{
		char [] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F',};
		char [] arr = new char [32];
		int pos = arr.length;
		while (num != 0)
		{
			int temp = num & base;
			arr [--pos] = chs[temp];
			num = num >>> offset;
		}
		for (int x = pos; x < arr.length ; x++)
		{
			System.out.print(arr[x]);
		}
	}
}
