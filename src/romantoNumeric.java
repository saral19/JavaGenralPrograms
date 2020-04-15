import java.util.Scanner;


public class romantoNumeric {
	public static int Numeric(String s)
	{
		int sum = 0;
		int len = s.length();
		s = s + " "; 
		for(int i=0;i<len;i++)
		{
			char ch   = s.charAt(i);
            char next_char = s.charAt(i+1);
			if(ch == 'M')
				sum += 1000;
			else if(ch == 'C')
			{
				if(next_char == 'M')
				{
					sum+=900;
					i++;
				}
				else if(next_char == 'D')
				{	
					sum+=400;
					i++;
				}
				else
					sum+=100;
			}
			else if(ch == 'D')
				sum+=500;
			else if(ch == 'X')
			{
				if(next_char == 'C')
				{
					sum+=90;
					i++;
				}
				else if(next_char == 'L')
				{
					sum+=40;
					i++;
				}
				else
					sum+=10;
			}
			else if(ch == 'L')
			{
				sum+=50;
			}
			else if(ch == 'I')
			{
				if(next_char == 'X')
				{
					sum+=9;
					i++;
				}
				else if(next_char == 'V')
				{
					sum+=4;
					i++;
				}
				else
					sum++;
			 }
			else
			{
				sum+=5;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number");
		String s = sc.next();
		System.out.println(Numeric(s));
	}

}
