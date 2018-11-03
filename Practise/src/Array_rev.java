import java.util.Scanner;

public class Array_rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of an array");
		int n = sc.nextInt();
		int [] x = new int[n];
		System.out.println("please enter elements");
		for (int i=0;i<=n-1;i++)
			x[i] = sc.nextInt();
		for(int y = x.length-1; y>=0;y--)
		{
			System.out.println(x[y]);
			
		}

	} 

}
