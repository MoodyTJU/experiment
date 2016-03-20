package moody;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
	private static Calculator cal = new Calculator();
	@Test
	public void testTriangle(){
		
	cal.triangle(2, 2, 2);
	assertEquals(3, cal.getReuslt());//等边三角形
	cal.triangle(3, 3, 5);
	assertEquals(2, cal.getReuslt());//等腰三角形
	cal.triangle(2, 3, 4);
	assertEquals(1, cal.getReuslt());//普通三角形
	cal.triangle(1, 2, 3);
	assertEquals(0, cal.getReuslt());//不能构成三角形
	cal.triangle(-1, 5, 3);
	assertEquals(0, cal.getReuslt());//不能构成三角形
	}

}
