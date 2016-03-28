/*
静态代码块
static
{
	静态代码块中的执行语句。
}

特点：静态代码块：
	随着类的加载而执行，只执行一次。并优先于主函数执行
	
	代码块：给对象初始化
*/
class StaticCode
{
	static
	{
		System.out.println("a");
	}
}
class StaticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args)
	{
		new StaticCode();
		new StaticCode();
		System.out.println("over");
	}
	static
	{
		System.out.println("c");
	}
}


// b  c(之后加载类StaticCodeDemo）  (主函数)a  (第二次不执行new StaticCode) over


//person p = new person("Zhangsan", 20);
/* 这句话地道的作用：
1.new用到了person.class, 所以会先找到person.class 文件并加载到内存中。
2.执行给类中的static代码块(静态代码构造块），如果有，给person.class类进行初始化；
3.在堆内存中开辟空间，分配内存地址。
4.在堆内存中建立对象特有属性，并进行默认初始化。
5.对属性进行显示初始化.
6.对对象进行构造代码块初始化。（没有修饰的代码构造快
7.对对象进行对应的构造函数初始化。new person("Zhang san" , 20)
8.将内存地址付给占内存中的P变量 */