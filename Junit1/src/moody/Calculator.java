package moody;
public class Calculator {
	private static int result = 0;
	public void triangle(int a,int b,int c)
	{
		if((a+b)>c && (a+c)>b && (b+c)>a && a>0 && b>0 && c>0)//�ж��Ƿ񹹳�������
		{
			if((a==b)||(a==c)||(b==c))
			{
				if((a == b)&&(a == c))
			    {
					result = 3;//�ȱ�
			    }
				else
				{
					result = 2;//����
				}
				
			}
			else
			{
				result = 1;//��ͨ
			}
		}
		
		else
		{
			result = 0;//����������
		}
		
	}
	public int getReuslt(){
		return result;
	}
	
		public void clear(){
		result = 0;
	}
}
