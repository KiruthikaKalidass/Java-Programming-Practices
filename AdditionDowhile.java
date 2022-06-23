package program_practice;

public class AdditionDowhile {
	public static void main(String[] args)
	{
		AdditionDowhile adw=new AdditionDowhile();
		adw.addition(10);

	}

	private void addition(int no) {
		// TODO Auto-generated method stub
		int total=0;
		int i=1;
		do {
			total=total+i;
			i++;
		}
		while(i<=no);
		System.out.println(total);
	}
}
