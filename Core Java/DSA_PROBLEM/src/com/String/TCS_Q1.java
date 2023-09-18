
/*W.R.P
 * Amarasimha wanted to know the final position of a person, 
 * who starts from the origin 0 0 and travels per following scheme.
 * 
 * SCHEME
 * 1) He first turns and travels 10 units of distance
   2) His second turn is upward for 20 units
   3)Third turn is to the left for 30 units
   4)Fourth turn is the downward for 40 units
   5)Fifth turn is to the right(again) for 50 units
   And thus he travels, every time increasing the travel distance by 10 units.
   CASE1:i/p :3
         o/p :-20 20
   CASE1:i/p :4
         o/p :-20 -20      
         
 */
package com.String;

import java.util.Scanner;

public class TCS_Q1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input value Of N:");
		int n=sc.nextInt();
		Position(n);
	}

	public static void Position(int n)
	{
		int distance=10;
		char ch='R';//this are direction R,U,L,D
		int x=0,y=0;
		while(n>0) 
		{
			switch(ch)
			{
			case 'R':
				x=x+distance;//x=10
				distance=distance+10;//d=20
				ch='U';//for jump to next case
				break;
				
			case 'U':
				y=y+distance;//y=20
				distance=distance+10;//d=30
				ch='L';
				break;
			
			case 'L':
				x=x-distance;//x=-20
				distance=distance+10;//d=40
				ch='D';
				break;
			
			case 'D':
				y=y-distance;//y=-20
				distance=distance+10;//d=50
				ch='A';//AGAIN
				break;
				
			case 'A':
				x=x+distance;//x=30;
				distance=distance+10;//d=60
				ch='R';
				break;
					
			}
			n--;
		}
		System.out.println("The direction of X and Y are:"+x+" "+y);
		
		
		

	}

}
