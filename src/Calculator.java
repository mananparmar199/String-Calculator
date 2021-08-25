
public class Calculator {

	public int add(String input) {
		String num[]=input.split(",");
		if(input.isEmpty())
			return 0;
		else if(num.length>1)
		{
			return sum(num);
		}
		return stringToInt(input);
		
	}
	private int sum(String[] num)
	{
		return stringToInt(num[0])+stringToInt(num[1]);
	}
	private int stringToInt(String num)
	{
		return Integer.parseInt(num);
	}

}
