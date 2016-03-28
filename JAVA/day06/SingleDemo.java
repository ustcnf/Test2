/*
	设计模式:
	单例设计模式：解决一个类在内存中只存在一个对象。
	应用：仅需要一个例子时，只需加上以上三步即可。如：配置文件
	
	想要保证对象唯一。
	1.为了避免其他程序过度奥建立该类对象。先禁止其他程序建立该类对象；
	2.为了让其他程序访问到该类对象，只好在本类中，自定义一个对象。
	3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
	
	具体实现：
	1.将构造函数私有化；
	2.在类中创建一个本类对象
	3.提供一个方法可以获取该对象
*/

class Single
{
	private Single(){}
	private static Single s = new Single();
	public static Single getInstance()
	{
		return s;
	}
}


class SingleDemo
{
	public static void main (String [] args)
	{
		Single ss = Single.getInstance();
		
	}
}