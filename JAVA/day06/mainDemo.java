/*
public static void main(String[] args)

����������һ������ĺ�������Ϊ�������ڣ���Ϊ��jvm����

���������壺
public:����ú����ķ���Ȩ�����ġ�
static:���������������۵ļ��ؾ��Ѿ������ˡ�
void: ������û�о���ķ���ֵ��
main:���ǹؼ��֣����ǿ��Ա�jvmʶ��
�����Ĳ�����String[] args�� ������һ�����飬������Ԫ��ʦ�ַ������ַ������͵� 
*/


/*
	Ϊʲôʹ�þ�̬
	Ҫ�����������֣�
	��Ϊ��̬���ε������г�Ա�����ͺ���
	ʱ���徲̬������
	�������е��г��ֹ�������ʱ,�����ݱ���̬�����Ρ�
Ȼ���������е���������Ҫ����ɷǾ�̬�����ڶ��ڴ��С�
	
	
	
	ʲôʱ���徲̬������
	�������ڲ�û�з��ʵ��Ǿ�̬���ݣ�������������ݣ���
��ô�ù��ܿ��Զ���Ϊ��̬�ġ�
	
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