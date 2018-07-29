/*Check a String is Palindrome or Not.........*/
package String_Package_1;

public class pallindrom {

	public static void main(String[] args) 
	{
			 
			String str="MADAM";
			String revstring="";//Create a Empty String
			 
			for(int i=str.length()-1;i>=0;--i)
			{
				
			revstring=revstring+str.charAt(i);//Storing in revstring
			}
			 
			System.out.println("String is: "+revstring);//Printing
			 
			if(revstring.equalsIgnoreCase(str))
			{
			System.out.println("The string is Palindrome");
			}
			else
			{
			System.out.println("The string is Not Palindrome");
			}
			 
			}


	}

