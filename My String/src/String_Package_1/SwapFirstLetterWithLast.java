package String_Package_1;

public class SwapFirstLetterWithLast {

	public static void main(String[] args) 
	{
		String str="Royal";
		String str1="";
		
		str1=str1+str.charAt(str.length()-1);
		
		for(int i=1;i<=str.length()-2;i++)
		{
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		str1=str1+str.charAt(0);
		System.out.println(str1);

	}

}
