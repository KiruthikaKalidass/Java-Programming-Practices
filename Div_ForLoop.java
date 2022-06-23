package program_practice;

import java.util.Scanner;

public class Div_ForLoop {
	public static void main(String[] args)
	{
		Div_ForLoop df=new Div_ForLoop();
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter no:  ");
		int no= sc.nextInt(); 
		df.findDivisior(no);
	}

	private void findDivisior(int no) {
		// TODO Auto-generated method stub
		for(int div=2;no>div;div++)
		{
			if(no%div==0)
			{
				System.out.println(div);
			}
			div=div+1;
		}
	}
}
