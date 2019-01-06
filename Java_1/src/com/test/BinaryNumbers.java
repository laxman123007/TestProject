package com.test;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "1010";
		//System.out.println(text.matches("^[01]+$"));
		
		System.out.println(getNuber(21222)); ;

	}
	
	public static String getNuber(Integer number)
	{
		String s = number.toString();
		int count = 0;
		String spell = "";
		
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			if(count == 0)
			{
				switch(s.charAt(i))
				{
				case '1' : 
					spell = "One";
					break;
				case '2' : 
					spell = "TWo";
					break;
					
				}
			}
			else if(count == 1)
			{
				switch(s.charAt(i))
				{
				
				case '2' : 
					spell = "Twenty " + spell;
					break;
				case '3' : 
					spell = "Thirty " + spell;
					break;
					
				}
				
				
			}
			else if(count == 2)
			{
				switch(s.charAt(i))
				{
				case '2' : 
					spell = "Two Hundred " + spell;
					break;
				case '3' : 
					spell = "Three Hundred " + spell;
					break;
					
				}
			}
			else if(count == 3)
			{
				switch(s.charAt(i))
				{
				case '1' : 
					spell = "One Thousand " + spell;
					break;
				case '2' : 
					spell = "Two Hundred " + spell;
					break;
					
				}
			}
			else if(count == 4)
			{
				switch(s.charAt(i))
				{
				case '2' : 
					spell = "Twenty  " + spell;
					break;
				case '3' : 
					spell = "Thirty " + spell;
					break;
					
				}
			}
						
			count ++;
			
		}
		return spell;
		
	}
	
	public String getSecondDecimal(char c)
	{
		String spell = "";
		switch(c)
		{
		case '2' : 
			spell = "Twenty  ";
			break;
		case '3' : 
			spell = "Thirty ";
			break;
			
		}
		return spell;
	}
	
	public String getFirstDecimal(char c)
	{
		
		/*String spell = "";
		switch(c)
		{
		case '1' : 
			spell = "Onw  ";
			break;
		case '3' : 
			spell = "Two ";
			break;
		case '2' : 
			spell = "Three  ";
			break;
		case '3' : 
			spell = "Four ";
			break;
		case '2' : 
			spell = "Two  ";
			break;
		case '3' : 
			spell = "Thirty ";
			break;
		case '2' : 
			spell = "Two  ";
			break;
		case '3' : 
			spell = "Thirty ";
			break;
			
			
		}
		return spell;
		*/
		return null;
	}
	

}
