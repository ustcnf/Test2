/*
需求：
电脑运行实例
电脑运行基于主板
*/

class MainBoard
{
	public void run()
	{
		System.out.println("Mainboard run");
	}
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
}

class NetCard
{
	public void open()
	{
		System.out.println("netcard open");
		
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}

class DuoTaiDemo5
{
	public static void main(String [] args)
	{
		MainBoard mb = new MainBoard();
		mb.run();
		mb.useNetCard(new NetCard());
	}
}