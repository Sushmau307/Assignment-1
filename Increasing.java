import java.util.*;
public class Increasing {

	
boolean increasing(int number)
{
	String s=Integer.toString(number);
	char ch;
	int f=0;
	for(int i=0;i<s.length()-1;i++)
	{
		ch=s.charAt(i);
		if(ch>s.charAt(i+1));
		{
			f=1;
			break;
		}
	}
	if(f==1)
		return false;
	else
		return true;
}

void numbers(int number)
{
	if(increasing(number)==true)
		System.out.println("Increasing");
	else
	{
		
	System.out.println("Bouncing");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    Increasing in=new Increasing();
    System.out.println("Enter the number:");
    int number=scan.nextInt();
    in.numbers(224468);
    
	}

}
