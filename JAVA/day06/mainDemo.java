/*
public static void main(String[] args)

主函数：是一个特殊的函数，作为程序的入口，作为被jvm调用

主函数定义：
public:代表该函数的访问权限最大的、
static:代表主函数随着累的加载就已经存在了。
void: 主函数没有具体的返回值。
main:不是关键字，但是可以被jvm识别
函数的参数：String[] args： 参数是一个数组，该数组元素师字符串。字符串类型的 
*/


/*
	为什么使用静态
	要从两方面下手：
	因为静态修饰的内容有成员变量和函数
	时候定义静态变量？
	当对象中的中出现共享数据时,该数据被静态所修饰。
然而，对象中的特有数据要定义成非静态存在于堆内存中。
	
	
	
	什么时候定义静态函数？
	当功能内部没有访问到非静态数据（对象的特有数据），
那么该功能可以定义为静态的。
	
*/


class MainDemo
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
}