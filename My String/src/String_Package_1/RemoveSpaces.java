package String_Package_1;

public class RemoveSpaces {

	public static void main(String[] args) 
	{
		String s1="My Name is Sunny";
		String s2="";
		
		System.out.println("original String is = "+s1);
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			
			if(ch!=' ')
			{
				s2=s2+ch;
			}
		}
		System.out.println("After Removing Spaces String is = "+s2);
	}
}
