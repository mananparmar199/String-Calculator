import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyJuint {
	@Test
	public void emptyStringReturnsZero()
	{
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate(""), 0);
	}
}
