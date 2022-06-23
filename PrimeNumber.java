package program_practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn= new PrimeNumber();
		pn.findprime(20);
		
	}

	private void findprime(int no) {
		// TODO Auto-generated method stub
		int div=2;
		while(no>div)
		{
			if(no%div==0)
			{
				System.out.println("Not Prime");
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
