
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
		for(int i=0;i<num.length;i++)
		{
			sum += stringToInt(num[i]);
		}
		return sum;
	}
	private int stringToInt(String num)
	{
		return Integer.parseInt(num);
	}

}
