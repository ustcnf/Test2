class numConvert
{
	public static void main(String[] args)
	{
		TenToBin2(-47);
	}
	// ten --> binary
/* 	public static void TenToBin(int num)
	{
		StringBuffer sa = new StringBuffer();
		while (num > 0)
		{
			sa.append(num%2);
			num = num / 2;
		}
		System.out.println(sa.reverse());
	} */
	
	//ten -->hex
	//Way1:
/* 	public static void TenToHex(int num)
	{
		StringBuffer s2 = new StringBuffer();
		while (num > 0)
		{
			if (num % 16 >=10)
				s2.append((char)(num - 10 + 'A'));
			else
				s2.append( num % 16 );
			num = num / 16;
		}
		System.out.println(s2.reverse());
	} */
	//Way2: TenToHex search table
/* 	public static void TenToHex2(int num)
	{
		char [] arr = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F',};
		StringBuffer s3 = new StringBuffer();
		while (num > 0)
		{
			s3.append(arr [num%16]);
			num = num /16 ;
		}
		System.out.println(s3.reverse());
	} */
	
	//Way2:TenToBin2  : search (include null intger)
	public static void TenToBin2 (int num)
	{
		char [] arr = {'0','1'};
		char [] save = new char [32];
		int pos = save.length;
		while (num != 0)
		{
			save [--pos] =arr [num & 1];
			num = num >>> 1;  //Attention:THis way need without signal method.
			
		}
		for (int x = pos; x < save.length; x++)
		{
			System.out.print(save [x]);
		}
	}
}
