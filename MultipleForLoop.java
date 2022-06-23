package program_practice;

public class MultipleForLoop {
	public static void main(String args[])
	{
		MultipleForLoop  mn=new MultipleForLoop ();
		mn.multiply(10);
	}

	private void multiply(int no) {
		// TODO Auto-generated method stub
		int total=1;
		for(int i=1;i<=no;i++)
		{
			total=total*i;
		}
		System.out.println(total);
	}
}
