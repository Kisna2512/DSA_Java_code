package src;

public class Palindrome_or {

	
	@SuppressWarnings("unused")
	private static boolean fun(int l,int r,String s)
	{
		if(l >= r)
		{
			return true;
		}
		if(s.charAt(l)!=s.charAt(r))
		{
			return false;
		}
		
	  return fun(l+1,r-1,s);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
          String s="wow";
          int n=s.length();
          if(fun(0,n-1,s))
          {
        	  System.out.println("It is a palindrome");
          }
          else
          {
        	  System.out.println("It is not a palindrome");
          }

	}

}
