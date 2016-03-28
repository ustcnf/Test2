class Person
{
	int age;
	void speak()
	{
		System.out.println("age="+age);
	}
}
class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.age = 20;
		p.speak();
	}
}
	/*
	privateL 私有：权限是修饰附，用于修饰类成员（成员变量，成员函数）
	私有只有在本类中有效
	将age私有化以后，类以外及时建立了对象也不能直接访问。
	但是人应该有年龄，需要在person类中提供对用的访问方法。
	封装不是私有，私有仅仅是封装的一种变现形式
	属性隐藏，提供公共访问方法
	Set 设置
	get 获取
	*/
	