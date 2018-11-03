import java.util.Scanner;

public class AA_Multiplies_of_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of an array");
		int n= sc.nextInt();
		int [] a = new int[n];
		System.out.println("please enter values into the array");
		for (int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		for (int x : a)
		{
			if (x%3==0)
			{
			System.out.println(x+ "is a multiple of 3");
			}
			else 
				System.out.println(x+ "is not a multiple of 3");
		}
	}

}
