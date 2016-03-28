/*
	静态应用:
	每一个应用程序中都有共性的功能，
可以将这些功能进行抽取，独立封装，以便复用。

	虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作
	但问题是：
	1.对象是用于封装数据的，可是ArrayTool对象并未封装特有数据。
	2.操作数据的每一个方法都没有用到ArrayTool对象中特有的数据。

这时就考虑，为了程序更严谨，是不需要对象的。
可以将ArrayTool中的方法都定义成static ,直接通过类名调用即可。

三：
将方法设为静态后，可以方便使用，但是该类还是可以被其他程序建立对象
为了更为严谨，强制让该类不能建立对象。
可以通过将构造函数私有化完成
 */

 
 /**
	制作程序说明书，java说明书通过文档注释来完成
	这是一个可以对数组进行操作的工具类，该类提供了获取最值，排序的功能。
	附：一个类中默认会有一个空参数的构造函数
	这个默认的构造函数的权限和所属类是一致的。
	如果类被public修饰，那么默认的构造函数也带public修饰符、
	如果类中没有被public修饰，那么默认的构造函数，也没有public修饰。
 
@author hnf
@version 1.0

	
 */
 
public class ArrayTool
 {
	/**
	空参数的构造函数。
	*/
	private ArrayTool(){}         //注意：这个很重要，对应第三点
	/**
	获取一个整形数组的最大值
	@param arr 接收一个该数组的最大值
	@return 会返回一个该数组的最大值
	*/
	
	public static int getMax(int[] arr)
	// public int getMax(int[] arr)
	{
		int max = 0;
		for(int x = 1; x < arr.length ; x++)
		{
			if(arr [x] > arr[max])
				max = x;
		}
		return arr[max];
	}
	/**
	获取一个整形数组的最小值
	@param arr 接收一个该数组的最小值
	@return 会返回一个该数组的最小值
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x = 1; x < arr.length ; x++)
		{
			if(arr [x] < arr[min])
				min = x;
		}
		return arr[min];
	}
	/**
	给int数组进行选择排序
	@param arr  接收一个int类型的数组
	*/
		public 	static void selectSort(int [] arr)
	// public void selectSort(int [] arr)   //每个都和全局比
	{
		for(int x = 0; x < arr.length -1 ; x++)
		{
			for(int y = x+1; y < arr.length; y++)
				if(arr[x] > arr[y])
				{
					swap(arr, x , y);
				} 
		}
	}
	
	/**
	给int数组进行冒泡排序
	@param arr  接收一个int类型的数组
	*/
	
	public static void bubbleSort(int [] arr)    //相邻的两个比
	{
		for(int x = 0; x < arr.length; x++)
		{
			for(int y = 0 ; y < arr.length - x -1 ;y++)
				if(arr [y] > arr[y+1])
					swap(arr, y, y+1);
		}
	}
	
	/**
	给数组元素进行位置的置换。
	@param arr  接收一个int类型的数组
	@param  a 要置换的位置
	@param  b 要置换的位置
	*/
	private static void swap(int [] arr, int a, int b)   //仅给该类使用
	{
		arr[a] = arr[a] ^ arr[b];
		arr[b] = arr[b] ^ arr[a];
		arr[a] = arr[a] ^ arr[b];
	}
	/**
	用于打印数组的元素，打印形式： [ element1. element2]
	@param arr 要打印的数组
	*/
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x = 0 ; x < arr.length ; x++)
			if( x != arr.length - 1)
			System.out.print(arr [x] + ",");
			else
			System.out.println(arr [x] + "]");
	}
 }
 

 

 
/* class MainDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		String[] arr = {"hah," ,"hehe"};
		MainTest.main(arr); 
	}
}

class MainTest
{
	public static void main(String[] args)
	{
		for(int x = 0; x < args.length; x++)
			System.out.println(args[x]);
			
	}
} */