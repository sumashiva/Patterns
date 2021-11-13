class Printing6
{


public static void main(String args[])  
{    
 int n = 5;
    int i, j;
 
    // do for each row
    for (i = n; i >= 1; i--)
    {
        // print '*' i times
        for (j = 1; j <= i; j++)
        {
            // print '*' for boundaries
            if (i == n || j == 1 || j == i) {
                System.out.print("*");
            }
            else {
               System.out.print(" ");
            }
        }
 
        // move to the next line
     System.out.print("\n");
    }
 
}  
}