/*
	���ģʽ:
	�������ģʽ�����һ�������ڴ���ֻ����һ������
	Ӧ�ã�����Ҫһ������ʱ��ֻ����������������ɡ��磺�����ļ�
	
	��Ҫ��֤����Ψһ��
	1.Ϊ�˱�������������Ȱ½�����������Ƚ�ֹ�����������������
	2.Ϊ��������������ʵ��������ֻ���ڱ����У��Զ���һ������
	3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��
	
	����ʵ�֣�
	1.�����캯��˽�л���
	2.�����д���һ���������
	3.�ṩһ���������Ի�ȡ�ö���
*/


//�ȳ�ʼ�����󣺶���ʽ
class Single
{
	private Single(){}
	private static Single s = new Single();
	public static Single getInstance()
	{
		return s;
	}
}

//�����Ƿ����������ǣ��ų�ʼ����Ҳ�����������ʱ���أ���Ϊ����ʽ��
class Single2
{
	private static Single2 s = NULL;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s == null)
			s = new Single2();
		return s;
	}
}

class SingleDemo2
{
	public static void main (String [] args)
	{
		Single ss = Single.getInstance();
		
	}
}