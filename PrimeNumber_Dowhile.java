package program_practice;

public class PrimeNumber_Dowhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber_Dowhile pn= new PrimeNumber_Dowhile();
		pn.findprime(23);
		
	}

	private void findprime(int no) {
		// TODO Auto-generated method stub
		int div=2;
		do {
		
			if(no%div==0)
			{
				System.out.println("Not a prime");
				break;
			}
			div++;
			if(no==div)
			{
				System.out.println("Its a Prime Number");
			}
		}
		while(no>div);
	}
}
