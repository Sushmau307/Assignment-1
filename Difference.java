
public class Difference {

	
	public static int calculateDifference(int n)
	{
		int sumSquare=(n*(n+1)*(2*n+1))/6;
		
		int sum=(n*(n+1))/2;
		
		int squaresum=sum*sum;
		
		return Math.abs(sumSquare-squaresum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Difference d=new Difference();
    System.out.println(d.calculateDifference(3));
    
    
	}

}
