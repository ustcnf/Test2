/*
1.描述学生对象
2.定义一个可操作学生对象的工具类；



思想：
1.通过获取键盘录入一行数据，并将这行中的信息封装成学生对象；
2.因为学生对象很多，那么需要存储的集合，因为对学生总分，所以可以使用TreeSet（）排序
3.将集合信息写入到一个文件

*/
import java.io.*;
import java.util.*;

class Student implements Comparable<Student>
{
	private String name;
	private int ma,cn,en;
	private int sum;
	Student(String name,int ma,int cn,int en)
	{
		this.name = name;
		this.ma = ma;
		this. cn = cn;
		this.en = en;
		sum = ma + cn + en;
		
	}
	public String getName()
	{
		
		return name;
	}
	public int getSum()
	{
		
		return sum;
	}
	public int hashcode()
	{
		return name.hashCode() + sum*78;
	}	
	public int compareTo(Student s)
	{
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		if(num == 0)
			return this.name.compareTo(s.name);
		return num;
	}
	
	public String toSring()
	{
		return "Student[:"+name+","+ma+","+cn+","+en+"]";
		
	}
	public boolean equals(Object obj)
	{
		if(!obj instanceof Student)
			throw new ClassCastException("类型不匹配");
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.sum == s.sum;
		
		
	}
	
	
}

class StudentInfoTool
{
	public static Set<Student> getStudent() throws IOException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		Set<Student> stus = new TreeSet<Student>();
		while((line = bufr.readLine())!= NULL)
		{
			if("over".equals(line))
				break;
			String [] info = line.split(",");
			Student stu = new Student(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
		return stus;
		
	}
	
	
	public static void write2File(Set<Student stus>) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("stuinfo.txt"));
		for (student stu: stus)
		{
			butw.write(stu.getName());
			butw.write(stu.getSum());
			butw.newLine();
			butw.flush();
		}
		
		butw.close();
		
	}
}


class
{
	public static void main(String [] args) throws IOException
	{
		Set<Student> stus = StudentInfoTool.getStudent();
		StudentInfoTool.Write2File(stus);
		
	}
	
}