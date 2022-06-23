package program_practice;

public class PrimeNumberForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberForLoop pn= new PrimeNumberForLoop();
		pn.findprime(23);
		
	}

	private void findprime(int no) {
		// TODO Auto-generated method stub
		int div;
		for(div=2;div<no;div++)
		{
			if(no%div==0)
			{
				System.out.println("Not a Prime");
				break;
			}
		}
		     if (no==div)
			{
				System.out.println("Its a Prime Number");
			}
		}


}
