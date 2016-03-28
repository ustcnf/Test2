/*
	����ʦ�Ͽ�
**/

class LanPingException extends Exception
{
	LanPingException (String message)
	{
		super(message);
	}
}
class MaoYanException extends Exception
{
	MaoYanException (String message)
	{
		super (message);
	}
	
}

class Computer

{
	private int state = 1;
	public void run()throws LanPingException, MaoYanException
	{
		if( state == 2)
			throw new LanPingException("����");
		if( state == 3)
			throw new MaoYanException("ð��");
		System.out.println("��������");
	}
	public void reset()
	
	{
		state = 1;
		System.out.println("��������");
	}
	
}
class Teacher
{
	private String name;
	private Computer cmpt;
	Teacher(String name)
	{
		this.name = name;
		cmpt = new Computer();
	}
	public void prolect()throws MaoYanException
	{
		try
		{
			cmpt.run();
		
		}
		catch (LanPingException e)
		{
			cmpt.reset();
		}
		catch (MaoYanException e)
		{
			throw e;
		}
		System.out.println("��ʼ�Ͽ�");
	}
}

class ExceptionTest
{
	public static void main (String[] args)
	{
		Teacher t = new Teacher("����ʦ");
		t.prolect();
	}
}