
public class palindromeCheck {
	 public static boolean isPalindrome(int x) {
	        int rev = 0;
	        int num = x;
	        while(x!=0)
	        {
	            rev = rev*10 + num%10;
	            num=num/10;
	        }
	        System.out.println(rev);
	        if(rev==x)
	            return true;
	        else
	            return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}

}
