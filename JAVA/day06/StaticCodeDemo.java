/*
��̬�����
static
{
	��̬������е�ִ����䡣
}

�ص㣺��̬����飺
	������ļ��ض�ִ�У�ִֻ��һ�Ρ���������������ִ��
	
	����飺�������ʼ��
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


// b  c(֮�������StaticCodeDemo��  (������)a  (�ڶ��β�ִ��new StaticCode) over


//person p = new person("Zhangsan", 20);
/* ��仰�ص������ã�
1.new�õ���person.class, ���Ի����ҵ�person.class �ļ������ص��ڴ��С�
2.ִ�и����е�static�����(��̬���빹��飩������У���person.class����г�ʼ����
3.�ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4.�ڶ��ڴ��н��������������ԣ�������Ĭ�ϳ�ʼ����
5.�����Խ�����ʾ��ʼ��.
6.�Զ�����й��������ʼ������û�����εĴ��빹���
7.�Զ�����ж�Ӧ�Ĺ��캯����ʼ����new person("Zhang san" , 20)
8.���ڴ��ַ����ռ�ڴ��е�P���� */