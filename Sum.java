import java.util.Scanner;
public class Sum {
public static void calculateSum(int N) {
	int sum=0;
	for(int num=0;num<N;num++) {
		if(num%3==0 || num%5==0)
		{
			sum=sum+num;
		}
	}
	System.out.println(sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sum s=new Sum();
    s.calculateSum(10);
	}

}
