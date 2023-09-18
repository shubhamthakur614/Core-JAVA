//if you want to reach from 00 to 22 then wee use maze path with help of 
//recursion

public class Maze_path 
{
	static int count=0;
	public static void main(String[] args) 
	{
		printMaze(0, 0, 2, 2, "");
		System.out.println("TOTAL NO OF WAY TO GO TO DESTINATION:"+count);
		
	}
    
	public static void printMaze(int cr,int cc,int er,int ec,String ans)
	//cr=current row path(source) ,er=end row path(Destination)
	{
		if(cr==er && cc==ec)//final output state
		{
			count++;
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec )//negative case
		{
			return;
		}
		
		printMaze(cr, cc+1, er, ec, ans+"H");
		printMaze(cr+1, cc, er, ec, ans+"V");
		//in case if you want to go through diagonal then add 1to row as well as colm
	    printMaze(cr+1,cc+1,er,ec,ans+"D");
	}

}
