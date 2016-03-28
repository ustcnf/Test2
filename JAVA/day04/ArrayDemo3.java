class ArrayDemo3
{
	public static void main(String[] args)
	{
	int [] arr = new int[3];
		for(int x = 0; x < arr.length; x++)
		{
			if( x != arr.length - 1)
			System.out.print("arr["+x+"]"+arr[x]+",");
			else
			System.out.println("arr["+x+"]"+arr[x]);
		}
	}
	
}