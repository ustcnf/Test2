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
	privateL ˽�У�Ȩ�������θ��������������Ա����Ա��������Ա������
	˽��ֻ���ڱ�������Ч
	��age˽�л��Ժ������⼰ʱ�����˶���Ҳ����ֱ�ӷ��ʡ�
	������Ӧ�������䣬��Ҫ��person�����ṩ���õķ��ʷ�����
	��װ����˽�У�˽�н����Ƿ�װ��һ�ֱ�����ʽ
	�������أ��ṩ�������ʷ���
	Set ����
	get ��ȡ
	*/
	