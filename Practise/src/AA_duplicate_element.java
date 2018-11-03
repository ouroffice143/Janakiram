import java.util.Scanner;

public class AA_duplicate_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of an array");
		int n = sc.nextInt();
		char [] ch = new char[n];
		System.out.println("please enter the elements");
		for (int i=0;i<n;i++)
			ch[i] = sc.next().charAt(0);
		System.out.println("please enter the character you want to check");
		char c= sc.next().charAt(0);
		int count = 0;
		for(char i :ch)
		{
			if(i==c)
				count++;
		}
		System.out.println(c+"is repeated" + count+"times");
		

	}

}
