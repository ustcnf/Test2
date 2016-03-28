/*
	��̬Ӧ��:
	ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ�
���Խ���Щ���ܽ��г�ȡ��������װ���Ա㸴�á�

	��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ���߷�������������в���
	�������ǣ�
	1.���������ڷ�װ���ݵģ�����ArrayTool����δ��װ�������ݡ�
	2.�������ݵ�ÿһ��������û���õ�ArrayTool���������е����ݡ�

��ʱ�Ϳ��ǣ�Ϊ�˳�����Ͻ����ǲ���Ҫ����ġ�
���Խ�ArrayTool�еķ����������static ,ֱ��ͨ���������ü��ɡ�

����
��������Ϊ��̬�󣬿��Է���ʹ�ã����Ǹ��໹�ǿ��Ա���������������
Ϊ�˸�Ϊ�Ͻ���ǿ���ø��಻�ܽ�������
����ͨ�������캯��˽�л����
 */

 
 /**
	��������˵���飬java˵����ͨ���ĵ�ע�������
	����һ�����Զ�������в����Ĺ����࣬�����ṩ�˻�ȡ��ֵ������Ĺ��ܡ�
	����һ������Ĭ�ϻ���һ���ղ����Ĺ��캯��
	���Ĭ�ϵĹ��캯����Ȩ�޺���������һ�µġ�
	����౻public���Σ���ôĬ�ϵĹ��캯��Ҳ��public���η���
	�������û�б�public���Σ���ôĬ�ϵĹ��캯����Ҳû��public���Ρ�
 
@author hnf
@version 1.0

	
 */
 
public class ArrayTool
 {
	/**
	�ղ����Ĺ��캯����
	*/
	private ArrayTool(){}         //ע�⣺�������Ҫ����Ӧ������
	/**
	��ȡһ��������������ֵ
	@param arr ����һ������������ֵ
	@return �᷵��һ������������ֵ
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
	��ȡһ�������������Сֵ
	@param arr ����һ�����������Сֵ
	@return �᷵��һ�����������Сֵ
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
	��int�������ѡ������
	@param arr  ����һ��int���͵�����
	*/
		public 	static void selectSort(int [] arr)
	// public void selectSort(int [] arr)   //ÿ������ȫ�ֱ�
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
	��int�������ð������
	@param arr  ����һ��int���͵�����
	*/
	
	public static void bubbleSort(int [] arr)    //���ڵ�������
	{
		for(int x = 0; x < arr.length; x++)
		{
			for(int y = 0 ; y < arr.length - x -1 ;y++)
				if(arr [y] > arr[y+1])
					swap(arr, y, y+1);
		}
	}
	
	/**
	������Ԫ�ؽ���λ�õ��û���
	@param arr  ����һ��int���͵�����
	@param  a Ҫ�û���λ��
	@param  b Ҫ�û���λ��
	*/
	private static void swap(int [] arr, int a, int b)   //��������ʹ��
	{
		arr[a] = arr[a] ^ arr[b];
		arr[b] = arr[b] ^ arr[a];
		arr[a] = arr[a] ^ arr[b];
	}
	/**
	���ڴ�ӡ�����Ԫ�أ���ӡ��ʽ�� [ element1. element2]
	@param arr Ҫ��ӡ������
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