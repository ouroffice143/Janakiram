import java.util.Scanner;

public class AA_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the range of an array");
		int n = sc.nextInt();
		int [] x = new int [n];
		System.out.println("please enter values");
		for(int i=0;i<=n-1;i++)
			x[i] = sc.nextInt();
		    for(int a :x) {
		    	if (a==2 || a==3||a==5||a==7||a==11) {
		    		System.out.println(a+"is a prime number");
		    	}
		    	else if(a%2==0 || a%3==0||a%5==0||a%7==0||a%11==0) {
		    		System.out.println(a+"is not a prime number");
		    	}
		    	else
		    		System.out.println(a+"is a prime number");
		    }
		    	

	}

}
