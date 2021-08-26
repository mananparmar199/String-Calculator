
public class Calculator {
	
	public int add(String input) {
		if(input.charAt(0)=='/')
		{
			String delimiter=input.substring(input.indexOf('/')+3,input.indexOf('n')-2);
			input = removeDelimiter(input,delimiter);
			String number[]=input.split(" ");
			return sum(number);
		}
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
			if(currNum.length()<=0)
				continue;
			if(stringToInt(currNum)>1000)
				continue;
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
	
	private String removeDelimiter(String input,String delimiter)
	{
		int index=(input.indexOf('n'))+1;
		String s="";
		for(int i=index;i<input.length();i++)
		{
			if(!checkDelimiter(input,delimiter,i))
			{
				s=s+Character.toString(input.charAt(i))+" ";
			}
			else
			{
				i=i+(delimiter.length()-1);
			}
		}
		return s;
	}
	
	private boolean checkDelimiter(String input,String delimiter,int index)
	{
		for(int i=0;i<delimiter.length();i++)
		{
			if(delimiter.charAt(i)!=input.charAt(index))
			{
				return false;
			}
			index++;
		}
		return true;
	}
}
