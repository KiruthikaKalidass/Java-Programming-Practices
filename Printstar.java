package pattern.program;

public class Printstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Printstar ps=new Printstar();
        ps.print();
        ps.print2();
        ps.print3();
        ps.print4();
        ps.print5();
       
        
	}

	

	private void print5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col<=row;col++)
			{
		
				System.out.print(col+ " ");
				for(int star=2;star<row;star++)
				{
			     System.out.print( "* ");
				}
			}
			System.out.println();
		}
	}



	private void print4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
		        if(row==1||row==2||row==3||row==4||row==5)
		        {
		        	if(col==1||col==row)
		        	{
		        		System.out.print("* ");
		        	}
		        	else
		        	{
		        		System.out.print("# ");
		        	}
		        }
			}
			System.out.println();
		}
	}

	private void print3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row-1;col++)
			{
				System.out.print("*  ");
			}
			for(int at=1;at<=6-row;at++)
			{
				System.out.print("@  ");
			}
			for(int at=6-row;at>=1;at--)
			{
				System.out.print("@  ");
			}
			for(int col=1;col<=row-1;col++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

	private void print2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=2;col<=row;col++)
			{
				System.out.print("*  ");
			}
			
			System.out.println();
		}
		}
	
     
	private void print() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
