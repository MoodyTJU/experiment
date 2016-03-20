package moody;
public class Calculator {
	private static int result = 0;
	public void triangle(int a,int b,int c)
	{
		if((a+b)>c && (a+c)>b && (b+c)>a && a>0 && b>0 && c>0)//判断是否构成三角形
		{
			if((a==b)||(a==c)||(b==c))
			{
				if((a == b)&&(a == c))
			    {
					result = 3;//等边
			    }
				else
				{
					result = 2;//等腰
				}
				
			}
			else
			{
				result = 1;//普通
			}
		}
		
		else
		{
			result = 0;//不是三角形
		}
		
	}
	public int getReuslt(){
		return result;
	}
	
		public void clear(){
		result = 0;
	}
}
