/*
	毕老师上课
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
			throw new LanPingException("蓝屏");
		if( state == 3)
			throw new MaoYanException("冒烟");
		System.out.println("电脑运行");
	}
	public void reset()
	
	{
		state = 1;
		System.out.println("电脑重启");
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
		System.out.println("开始上课");
	}
}

class ExceptionTest
{
	public static void main (String[] args)
	{
		Teacher t = new Teacher("毕老师");
		t.prolect();
	}
}