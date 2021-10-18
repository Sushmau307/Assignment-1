import java.util.Scanner;
public class Power {

	public static boolean powerOfTwo(int n)
	{
	
		while(n%2==0)
		{
			n=n/2;
			
		}
		if(n==1)
		{
			return true;
			}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		Power p=new Power();
    System.out.println(p.powerOfTwo(n));
	}

}
