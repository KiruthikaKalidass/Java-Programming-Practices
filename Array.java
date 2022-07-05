package Array.learnings;

public class Array {
	public static void main(String[] args)
	{
		Array ar=new Array();
		 // ar.findIndexPosition();
		//ar.findHighestValue();
		//ar.findLowestValue();
		//ar.RightShift();
		//ar.RightShift2();
		//ar.RightShift3();
		//ar.LeftShift();
		//ar.leftShift1();	
		//ar.findEvenNumber();
		//ar.findOddNumber();
		//ar.findEvenIndex();
		//ar.findOddIndex();
        //ar.SecondHighestNumber();
        //ar.SecondLowestNumber();
		ar.bubblesort();
		//ar.RightShiftTwo();
		//ar.LeftShiftTwo();
	}
	private void LeftShiftTwo() {
		// TODO Auto-generated method stub
		int[] ar= {10 ,5 ,8, 3, 2 };
	    for(int z=1; z<=2; z++) {
	      int temp=ar[0];
	    for(int i=0;i<4;i++) {
	      ar[i]=ar[i+1];
	      }
	       ar[4]=temp;
	    }
	    for(int j=0;j<ar.length;  j++) {
	      System.out.print(ar[j] +" ");
	    }
	}
	public void RightShiftTwo() {
	    int[] ar= {10 ,5 ,8, 3, 2 };
	    for(int k=1; k<=2; k++) {
	      int temp=ar[4];
	    for(int i=4;i>=1;i--) {
	      ar[i]=ar[i-1];
	      }
	    ar[0]=temp;
	    }
	    for(int j=0;j<ar.length;  j++) {
	      System.out.print(ar[j] +" ");
	    }
	  }
	private void bubblesort() {
		// TODO Auto-generated method stub
		int[] a= {12,10,7,3};
		for(int j=1;j<a.length;j++)
		{
			for(int i=0;i<a.length-j;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp= a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				}
			}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		}
	private void SecondLowestNumber() {
		// TODO Auto-generated method stub
		int[] marks = {90, 76, 58, 98, 100};
	    int low = marks[0]; 
	    int sec_low = marks[0]; 
	    for(int i=0; i<marks.length; i++)
	    {  //99 > 100
	    if(marks[i]<low){    
	    sec_low = low;       
	    low = marks[i];       
	    }              
	    else if(marks[i]<sec_low){                
	      sec_low = marks[i];
	    }  
	    }
	    System.out.println("Lowest Number is "+ low);
	    System.out.println("Second Lowest Number is "+ sec_low);
	}
	private void SecondHighestNumber() {
		// TODO Auto-generated method stub
		int[] marks = {90, 76, 58, 98, 100};
		    int high = marks[0]; 
		    int sec_high = marks[0]; 
		    for(int i=0; i<marks.length; i++)
		    {  //99 > 100
		    if(marks[i]>high){    
		    sec_high = high;       
		    high = marks[i];       
		    }              
		    else if(marks[i]>sec_high){                
		      sec_high = marks[i];
		    }  
		    }
		    System.out.println("Highest is "+ high);
		    System.out.println("Second Highest is "+ sec_high);

		  }
	
	private void findOddIndex() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,7,8,2,6};
		
		for(int i=0;i<ar.length;i++) {
			if(i%2!=0 && ar[i]!=0)
			{
			System.out.print(ar[i]+" ");
			}
		}
	}
	private void findEvenIndex() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,7,8,2,6};
		
		for(int i=0;i<ar.length;i=i+2) {
			System.out.print(ar[i]+" ");
	
		}
	}
	private void findOddNumber() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,7,8,2,6};
		for(int i=0;i<ar.length;i++) {
		if(ar[i]%2!=0)
		{
			System.out.print(ar[i]+" ");
		}
		}
	}
	private void findEvenNumber() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,7,8,2,6};
		for(int i=0;i<ar.length;i++) {
		if(ar[i]%2==0)
		{
			System.out.print(ar[i]+" ");
		}
		}
		
	}
	private void leftShift1() {
		// TODO Auto-generated method stub
		int[] ar={10,5,8,3,2};
		int temp=ar[0];
		int temp2=ar[1];
		for(int i=0;i<=2;i++)
		{
			ar[i]=ar[i+2];
		}
		ar[4]=temp;
		ar[3]=temp2;
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	private void LeftShift() {
		// TODO Auto-generated method stub
		int[] ar={10,5,8,3,2};
		int temp=ar[0];
		int temp2=ar[1];
		for(int i=0;i<=2;i++)
		{
			ar[i]=ar[i+2];
		}
		ar[4]=temp2;
		ar[3]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	private void RightShift3() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,8,3,2};
		int temp=ar[3];
		int temp2=ar[4];
		for(int i=4;i>=2;i--)
		{
			ar[i]=ar[i-2];
		}
		ar[0]=temp;
		ar[1]=temp2;
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");	
		}
	}
	private void RightShift2() {
		// TODO Auto-generated method stub
		int[] ar= {10,5,8,3,2};
		int temp=ar[4];
		int temp2=ar[3];
		for(int i=4;i>=2;i--)
		{
			ar[i]=ar[i-2];
		}
		ar[0]=temp;
		ar[1]=temp2;
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");	
		}
	}
	private void RightShift() {
		// TODO Auto-generated method stub
		int[] ar = {5,10,15,20,25,8}; 
		int temp = ar[5]; 
		for(int i=5; i>=1; i--)
		{
		ar[i] = ar[i-1]; 
		}
		ar[0] = temp; 
		for(int i=0; i<ar.length; i++){
		System.out.print(ar[i]+" "); 
		} 
	}
	private void findLowestValue() {
		// TODO Auto-generated method stub
		int[] marks= {90,76,58,98,100,105};
		int low=marks[0];
		for (int i=0;i<marks.length;i++)
		{
			if(marks[i]<low)
				low=marks[i];
		}
		System.out.println("The lowest Number is:"+low);
		
	}
	private void findHighestValue() {
		// TODO Auto-generated method stub
		int[] marks = {90, 76, 58, 98, 100,105};
		int high =0; 
		for(int i=0; i<marks.length; i++)
		{
		if(marks[i]>high)
		  high = marks[i]; //high = 90
		}
		System.out.println(high); 
		
	}
	private void findIndexPosition() {
		// TODO Auto-generated method stub
	int[] ar = {10, 5, 7,8, 2, 6}; 
	int no = 6; 
	for(int i =0; i<ar.length; i++)
	{
	if(ar[i] ==no)
	  {
	  System.out.println("Yes, present at "+ i); 
	  break; 
	  }
	} 
}
}
