package program_practice;

public class Div_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div_Dowhile dv=new Div_Dowhile();
		dv.findDivisior(120);
	}

	private void findDivisior(int no) {
		// TODO Auto-generated method stub
		int div=2;
		do
		{
			if(no%div==0)
			{
			System.out.println(div);
			}
			div=div+1;
		}
		while(no>div);
	}

}
