package program_practice;
import java.util.Scanner;
public class Divisior {
public static void main(String[] args)
{
	Divisior d=new Divisior();
	Scanner sc= new Scanner(System.in);  
	System.out.println("Enter no:  ");
	int i= sc.nextInt();  
	d.findDiv(i);
}

private void findDiv(int i) {
	// TODO Auto-generated method stub
	int div=2;
	while(i>div)
	{
		if(i%div==0)
		{
			System.out.println(div);
		}
		div=div+1;
	}
}
}
