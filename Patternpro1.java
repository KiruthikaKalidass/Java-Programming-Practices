package pattern.program;

public class Patternpro1 {
       public static void main(String[] args) 
		{
			Patternpro1 pp=new Patternpro1();
			pp.pattern1();
			pp.pattern2();
			
		}

		private void pattern1() {
			// TODO Auto-generated method stub
			int rows=5;
			 for (int i = 1; i <= rows; i++)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(i + " ");
		            }
		            System.out.println();
		        }
		}
		private void pattern2() {
			// TODO Auto-generated method stub
			int rows=5;
			 for (int i = rows; i >=1; i--)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(i + " ");
		            }
		            System.out.println();
		        }
		}

	}

