package program_practice;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber pn=new PrintNumber();
		pn.PrintNo(10);
		
	}

	private void PrintNo(int no) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=no)
		{
			System.out.println(i);
			i++;
		}

	}

}
