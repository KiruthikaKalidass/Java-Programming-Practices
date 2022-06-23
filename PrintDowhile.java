package program_practice;

public class PrintDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDowhile pdw=new PrintDowhile();
		pdw.PrintNumber(30);
	}

	private void PrintNumber(int no) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=no);
	}

}
