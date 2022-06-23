package program_practice;

public class addition {
  public static void main(String[] args)
  {
	  addition ad=new addition();
	  ad.add(10);
  }

private void add(int no) {
	// TODO Auto-generated method stub
	int i=1;
	int total=0;
	while(i<=10)
	{
		total=total+i;
		i++;
	}
	System.out.println(total);
	
}
}
