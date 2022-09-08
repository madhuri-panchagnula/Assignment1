package in.ineuron;

public class PatternA1Q4 {

	public static void main(String[] args) {
		int n=14;
		int r=n/2 +1;
		
		for(int i=0; i<r;i++ )
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/2 || i>=j || i+j >= n-1)
				
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
