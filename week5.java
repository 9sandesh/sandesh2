package fall2023;

public class week5 {
	
	
public void sum(int a, int b)
		{
			int s=0;
			for (int i=a;i<=b;i++)
			{
				s+=i;
			}
				
				

			System.out.println("the value of s is "+ s);
		}
		public static int total (int i1,int i2)
		{
			int sum=0;
			for(int i=i1;i<=i2;i++)
			{
				sum+=i;
			}
			return sum;
		}
		
	  public static void main(String[] args) {
		  week5 z=new week5();
		  z.sum(10, 20);
		  System.out.println("sum from 1 to 10 is "+ total(1,10));
		  System.out.println("sum from 20 to 30 is "+ total(20,30));
		  System.out.println("sum from 35 to 45 is "+ total(35,45));
	  }

	}
