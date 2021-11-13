class Priting4
{
public static void main(String [] args)
{
 int n = 5;
    int i, j, k;
 
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j < i; j++)
			{
         System.out.print(" ");
        }
        for (k = i; k <= n; k++)
        {
            if (i == 1 || k == i || k == n) {
                System.out.printf("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
 

}

}