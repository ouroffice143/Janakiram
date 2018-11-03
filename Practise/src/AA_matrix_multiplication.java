import java.util.Scanner;

public class AA_matrix_multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter rows and colomns of first matrix");
		int m = sc.nextInt();
		int n= sc.nextInt();
		int [] [] x = new int[m][n];
		System.out.println("please enter the elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				x [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("please enter rows and colomns of second matrix");
		int p = sc.nextInt();
		int q= sc.nextInt();
		if(n!=p)
			System.out.println("The matrices can't be multiplied with each other.");
		else {
		int [] [] y = new int[p][q];
		int [] [] multiply = new int [m][q];
		System.out.println("please enter the elements of second matrix");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				y [i][j] = sc.nextInt();
				
				
			}
			
		}

		int sum=0;
		 for ( int i = 0; i < m; i++)
         {
            for (int j = 0; j < q; j++)
            {  
               for (int k = 0; k < p; k++)
               {
                  sum = sum + x[i][k]*y[k][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
		 System.out.println("Product of the matrices:");
		 
         for ( int i = 0; i < m; i++)
         {
            for ( int j = 0; j < q; j++)
               System.out.print(multiply[i][j]+"\t");
 
            System.out.print("\n");
         }
		}
		
		

	}

}
