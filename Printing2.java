class Printing2
{
public static void main(String [] args)
{
for (int row= 5; row>= 1; row--)  
		{  
			for (int col=5; col>row;col--)  
			{  
				System.out.print(" ");  
			}  
			for (int k=1;k<=row;k++)  
			{  
				System.out.print("*");  
			}  
				System.out.println("");  
		}  


}

}