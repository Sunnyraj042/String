/*Write a program to  Retrieve a character and Print.........*/
package String_Package_1;

public class RetriveChar {

	public static void main(String[] args)
   {
		int i;
		char ch;
		String s =new String("Sunny");
		for(i=0;i<=s.length()-1;i++)
		{
			ch=s.charAt(i);
			System.out.println(ch);
		}
		
	}

}
