import java.util.ArrayList;
import java.util.List;

//put all the parenthesis in array list
public class Valid_parentesis 
{
	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		parentesis(3, 0, 0, "",list);
		System.out.println(list);
		
	}
	
	static void parentesis(int n,int open,int close, String val,List<String> list)
	{
		if(open==n && close==n)
		{
			list.add(val);
			return;
		}
		if (open>n || close>open)
		{
			return;
		}
		
		parentesis(n,open+1,close,val+"( ",list);
		parentesis(n,open,close+1,val+") ",list);
		
	}

}
