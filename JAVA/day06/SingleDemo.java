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