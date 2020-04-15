import java.util.Scanner;


public class reverseNumber {
	public static int reverse(int num)
	{
		long rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
			return 0;
		return (int)rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Reverse of the number will be " + reverse(num));
		System.out.println(Integer.MAX_VALUE);
	}

}
