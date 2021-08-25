import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyJuint {
	
	private Calculator calculator;
	
	@Before
	public void initialize()
	{
		calculator =new Calculator();
	}
	
	@Test
	public void emptyStringReturnsZero()
	{
		assertEquals(calculator.add("1"), 1);
	}
	
	@Test
	public void commaDelimetedShouldBeSummed()
	{
		assertEquals(calculator.add("5,4"), 9);
	}
	
	@Test
	public void newLineDelimetedShouldBeSummed()
	{
		assertEquals(calculator.add("1\n2"), 3);	
	}
	
	@Test
	public void unknownAmountOfNumbersShouldBeSummed()
	{
		assertEquals(calculator.add("1\n2,3"), 6);
	}
}
