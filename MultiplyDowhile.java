package program_practice;

public class MultiplyDowhile {

	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
		MultiplyDowhile mdw= new MultiplyDowhile();
		mdw.multiply(5);
      }

	private void multiply(int no) 
	{
		// TODO Auto-generated method stub
		int i=1;
		int total=1;
		do
		{
		   total=total*i;
		   i++;
		}
		while(i<=no);
		System.out.println(total);
		
	}

}
