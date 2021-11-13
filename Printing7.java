class Printing7
{
	public static void main(String [] args)
	{
for (int row=0; row<5; row++) //0<5/  
		{  
			for (int col=2*(5-row); col>=0; col--) // col=10;10>=0/       
			{      
				System.out.print(" ");   
			}   
				for (int col=0; col<=row; col++ )   
				{       
					System.out.print("* ");   
				}   
			System.out.println(); 
		}   
	} 
	
}
