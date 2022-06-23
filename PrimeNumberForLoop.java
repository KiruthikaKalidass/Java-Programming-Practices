package program_practice;

public class PrimeNumberForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberForLoop pn= new PrimeNumberForLoop();
		pn.findprime(20);
		
	}

	private void findprime(int no) {
		// TODO Auto-generated method stub
		for(int div=2;no>div;div++)
		{
			if(no%div==0)
			{
				System.out.println("Not a Prime");
				break;
			}
			div++;
		     if (no==div)
			{
				System.out.println("Its a Prime Number");
			}
		}
	}

}
