package String_Package_1;

public class removeDuplicateInString 
{
	/**
	 * @author SunnyRaj
	 *Remove Duplicates Character Present in a String
	 */

		public static void main(String[] args) 
		{
	     String str="Sunny";
	     String str1="";
	     
	     for(int i=0;i<=str.length()-1;i++)
	     {
	    	 int count=0;
	    	 for(int j=0;j<=str1.length()-1;j++)
	    	 {
	    		 if(str.charAt(i)==str1.charAt(j))
	    		 {
	    			 count++;
	    			 break;
	    		 }
	    	 }
	    	 if(count==0)
	    	 {
	    		 str1=str1+str.charAt(i);
	    	 }
	     }
	     System.out.println(str1);
		}
		

}
