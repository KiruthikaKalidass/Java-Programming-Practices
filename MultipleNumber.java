package program_practice;

public class MultipleNumber {
public static void main(String args[])
{
	MultipleNumber mn=new MultipleNumber();
	mn.multiply(5);
}

private void multiply(int no) {
	// TODO Auto-generated method stub
	int i=1;
	int total=1;
	while(i<=no)
	{
		total=total*i;
		i++;
	}
	System.out.println(total);
}
}
