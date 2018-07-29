
package String_Package_1;


/**
 * @author SunnyRaj
 *Count Number of Each Vowels Given in a String
 */
public class CountEachVowels {

	public static void main(String[] args) 
	{
		String str="Slice Delicious";
		int acount=0,ecount=0,icount=0,ocount=0,ucount=0,i;
	    String s1=str.toLowerCase();
	    for(i=0;i<=s1.length()-1;i++)
	    {
	    	char ch=str.charAt(i);
	    	
	    	if(ch=='a')
	    		acount++;
	    	if(ch=='e')
	    	    ecount++;
	    	if(ch=='i')
	    		icount++;
	    	if(ch=='o')
	    		ocount++;
	    	if(ch=='u')
	    		ucount++;
	    	}
	    System.out.println("a is "+acount);
	    System.out.println("e is "+ecount);
	    System.out.println("i is "+icount);
	    System.out.println("o is "+ocount);
	    System.out.println("u is "+ucount);
	    }
	    
         
	}

