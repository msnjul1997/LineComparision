package kittu;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparision computation on master branch");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1: ");
		int x1= sc.nextInt();
		System.out.println("Enter y1: ");
		int y1= sc.nextInt();
		System.out.println("Enter x2: ");
		int x2= sc.nextInt();
		System.out.println("Enter y2: ");
		int y2= sc.nextInt();
		double Line1= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length of Line1: "+Line1);
		
		
		System.out.println("Enter p1: ");
		int p1= sc.nextInt();
		System.out.println("Enter q1: ");
		int q1=sc.nextInt();
		System.out.println("Enter p2: ");
		int p2= sc.nextInt();
		System.out.println("Enter q2: ");
		int q2= sc.nextInt();
		double Line2= Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
		System.out.println("length of Line2: "+Line2);
		/*
		 * boolean ans = Line1.equals(Line2); if(Line1==Line2)
		 * System.out.println("Both lines are equal."); else
		 * System.out.println("Both lines are not equal.");
		 */
		/*
		 * int res = Line1.compareTo(Line2); if(res > 0) System.out.
		 * println("Length of first end points is greater than length of second end points"
		 * ); else if(res < 0) System.out.
		 * println("Length of first end points is less than length of second end points"
		 * ); else System.out.println("Both lines are equal.");
		 */
}
}
