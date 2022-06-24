package pattern.program;

public class Patternpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patternpro pp=new Patternpro();
		pp.pattern();
		
	}

	private void pattern() {
		// TODO Auto-generated method stub
		 int rows=7;
		 for (int i = 1; i <= rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	}

}
