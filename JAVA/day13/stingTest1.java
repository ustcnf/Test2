/* 1��ģ��һ��trim������ȥ���ַ������˵Ŀո�
	˼·��
	1���ж��ַ�����һ��λ���Ƿ��ǿո�����Ǽ��������жϣ�ֱ�����ǿո�Ϊֹ��
		��β���жϿո�Ҳ����ˡ�
	2������ʼ�ͽ�β���жϵ����ǿո�ʱ������Ҫ��ȡ���ַ����� 
*/

class stringTest
{
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void main(String [] args)
	{
		/*`Test 2 
		String s = "    sfasdfasdf  asdfd    "; */
		String s = "abkkcdkkefkkskk";
		sop("("+ s + ")");
		/* Test 1
		s = myTrim(s); */
		/* Test 2
		s = myReverse(s); */
		
		int t = myCount2(s, "kk");
		sop("("+ t + ")");
		sop("("+ s + ")");
	}
	public static String myTrim(String str)
	{
		int start = 0, end = str.length() - 1;
		while(start <= end && str.charAt(start) == ' ')
		{
			start++;
		}
		while(start <= end && str.charAt(end) == ' ')
		{
			end--;
		}
		return str.substring(start, end + 1);
	}
	
/* 2����һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��"abcdefg";abfedcg
	˼·��
	1������ѧϰ���������Ԫ�ؽ��з�ת��
	2�����ַ���������飬�����鷴ת��
	3������ת����������ַ�����
	4��ֻҪ����ת�Ĳ��ֵĿ�ʼ�ͽ���λ����Ϊ�������ݼ��ɡ�
 */
 
	public static String myReverse(String str)
	{
		char[] chs = str.toCharArray();
		reverse(chs);
		return new String(chs);
		
	}
	private static void reverse(char[] arr)
	{
		for(int start = 0, end = arr.length - 1; start < end; start++, end--)
		{
			swap(arr, start, end);
		}
	}
	private static void swap(char[] arr, int start, int end)
	{
		char temp;
		temp = arr [start];
		arr[start] = arr [end];
		arr [end] = temp;
		/* arr[start] = arr[start] ^ arr[end];
		arr[end] = arr[start] ^ arr[end];
		arr[start] = arr[start] ^ arr[end]; */
		
	}
	
	/*
3����ȡһ���ַ�������һ���ַ����г��ֵĴ�����
	"abkkcdkkefkkskk"


	˼·��
	1���������������
	2����ȡkk��һ�γ��ֵ�λ�á�
	3���ӵ�һ�γ���λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�á�
		ÿ��ȡһ�ξͼ���һ�Ρ�
	4������ȡ����ʱ��������ɡ�



*/
	public static int myCount(String s, String sub)
	{
		int count = 0;
		int index = 0;
		while((index = s.indexOf(sub)) != -1)
		{
			count++;
			s = s.substring(index + sub.length());
		}
		return count;
	}
	public static int myCount2(String s, String sub)
	{
		int count = 0;
		int index = 0;
		while((index = s.indexOf(sub, index)) != -1)
		{
			index = index + sub.length();
			count++;
		}
		return count;
	}
	
	/*
4����ȡ�����ַ����������ͬ�Ӵ�����һ�����������̵��Ǹ������г���һ�εݼ����Ӵ���ӡ��
	"abcwerthelloyuiodef"
	"cvhellobnm"
	˼·��
		1�����̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ����
		2����ÿ��ȡ�����Ӵ�ȥ�������ж��Ƿ������
			����������Ѿ��ҵ�����
*/
	
	public static String myGetSubstring(String s1, String s2)
	{
		String max = "", min = "";
		max = (s1.length() > s2.length()) ? s1 : s2;
		min = (max == s1) ? s2 : s1;
		for(int x = 0; x <= min.length() - 1; x ++)
		{	
			for(int y = 0, int z = min.length() -1 - x; z <= min.length() - 1; y++, z++)
			{
				String temp = min.substring(y, z);
				if(max.contains(temp);
				return temp;
			
			}
		}
		return "";
			
			
		
	}
}
	

 
 