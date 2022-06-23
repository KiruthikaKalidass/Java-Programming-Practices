package program_practice;

public class AdditionForLoop {
public static void main(String[] args)
{
	AdditionForLoop afl=new AdditionForLoop();
	afl.addition(10);

}

private void addition(int no) {
	// TODO Auto-generated method stub
	
	int total=0;
	for(int i=1;i<=no;i++)
	{
		total=total+i;	
	}
	System.out.println(total);
}
}
