import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Area {
	
	public static void area_of_triangle()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter base");
		int base = sc.nextInt();
		System.out.println("please enter height");
		int height = sc.nextInt();
		double area = 0.5*base*height;
		System.out.println("area of triangle is"+ area );
		
	}
	
	public static void perimeter_of_triangle()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter length of first side");
		int a = sc.nextInt();
		System.out.println("please enter length of second side");
		int b = sc.nextInt();
		System.out.println("please enter length of third side");
		int c = sc.nextInt();
		int perimeter = a+b+c;
		System.out.println("perimeter of triangle is"+ perimeter);
		
	}
	public static void area_of_circle() {
		int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
	}
	public static void circumference_of_circle() {
		int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        double circumference = pi * r * 2;
        System.out.println("Area of circle:"+circumference);
	}
	


	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("please enter any number" );
		System.out.println("1------->press to area of triangle" );
		System.out.println("2------->press to perimeter of triangle" );
		System.out.println("3------->press to area of circle" );
		System.out.println("4------->press to circumference of circle" );
		int n = Integer.parseInt(br.readLine());
		switch(n)
		{
		case 1: area_of_triangle();
		        break;
		case 2: perimeter_of_triangle();
                break; 
		case 3: area_of_circle();
        break;       
		case 4: circumference_of_circle() ;
        break;       
			default :System.out.println("valid option");
		}
		System.out.println("do you want to continue:y/n");
		char ch = br.readLine().charAt(0);
		while(ch=='y');
		
  
	}

}
