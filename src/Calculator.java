
public class Calculator {

	public int add(String input) {
		String num[]=input.split(",|\n");
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
		int sum=0;
		for(String currNum:num)
		{
			sum += stringToInt(currNum);
		}
		return sum;
	}
	private int stringToInt(String num)
	{
		int n = Integer.parseInt(num);
		if(n<0)
			throw new IllegalArgumentException("Negative Input!");
		else
			return n;
	}

}
