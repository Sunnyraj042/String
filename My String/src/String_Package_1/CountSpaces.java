package String_Package_1;


/**
 * @author SunnyRaj
 *Count Spaces Present in a Given String
 */
public class CountSpaces {

	public static void main(String[] args) 
	{
		String s1="Life is Wife and wife is Life";
		//String s2="";
		int spacecount=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				spacecount++;
			}
		}
        System.out.println("No of Spaces = "+spacecount);
	}

}
