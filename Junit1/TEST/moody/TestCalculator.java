package moody;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
	private static Calculator cal = new Calculator();
	@Test
	public void testTriangle(){
		
	cal.triangle(2, 2, 2);
	assertEquals(3, cal.getReuslt());//�ȱ�������
	cal.triangle(3, 3, 5);
	assertEquals(2, cal.getReuslt());//����������
	cal.triangle(2, 3, 4);
	assertEquals(1, cal.getReuslt());//��ͨ������
	cal.triangle(1, 2, 3);
	assertEquals(0, cal.getReuslt());//���ܹ���������
	cal.triangle(-1, 5, 3);
	assertEquals(0, cal.getReuslt());//���ܹ���������
	}

}
