/*Count all Vowels.....................*/

package String_Package_1;

public class CountVowles 
{
	public static void main(String[] args)
	{
		String str=new String("Fruity Delicious");
		int count=0;
		str.toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("Number of Vowels = "+count);
	}
	
	

}
