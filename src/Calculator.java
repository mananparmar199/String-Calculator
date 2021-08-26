import java.util.ArrayList;

public class Calculator {
	
	public int add(String input) {
		if(input.charAt(0)=='/')
		{
			ArrayList<String> delimiterList=new ArrayList<String>();
			String delimiter=input.substring(input.indexOf('/')+2,input.indexOf('n')-1);
			findDelimiter(delimiterList,delimiter);
			input = removeDelimiter(input,delimiterList);
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
	
	private String removeDelimiter(String input,ArrayList<String> delimiterList)
	{
		int index=(input.indexOf('n'))+1;
		String s="";
		for(int i=index;i<input.length();i++)
		{
			int length=checkDelimiter(input,delimiterList,i);
			if(length<=0)
			{
				s=s+Character.toString(input.charAt(i))+" ";
			}
			else
			{
				i=i+(length-1);
			}
		}
		return s;
	}
	
	private int checkDelimiter(String input,ArrayList<String> delimiterList,int index)
	{
		int tempIndex=index;
		for(String delimiter:delimiterList)
		{
			int count=0;
			for(int i=0;i<delimiter.length();i++)
			{
				if(delimiter.charAt(i)!=input.charAt(index))
				{
					break;
				}
				else
					count++;
				index++;
			}
			if(count==delimiter.length())
				return count;
			index=tempIndex;
		}
		return -1;
	}
	
	private void findDelimiter(ArrayList<String> delimiterList,String delimiter)
	{
		String x="";
		for(int i=0;i<delimiter.length();i++)
		{
			if(delimiter.charAt(i)=='[')
			{
				i++;
				while(delimiter.charAt(i)!=']')
				{
					x=x+Character.toString(delimiter.charAt(i));
					i++;
				}
				delimiterList.add(x);
				x="";
			}
		}
	}
}
