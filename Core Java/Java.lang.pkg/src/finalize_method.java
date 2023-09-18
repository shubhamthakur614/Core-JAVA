//protected void finalize()throws Throwable

//Garbage collector called finalize() to perform clean up operation before
//destroying unreference object

public class finalize_method {
	public static void main(String[] args) 
	{
        finalize_method m = new finalize_method();
		System.out.println(m.hashCode());
		m = null;
		// This object are applicable for gc becz its a unreference object
		System.gc();
		System.out.println("GARBAGE COLLECTOR CLEAN THE UNREFERENCE OBJECT:");
		//System.out.println(m.hashCode());
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE METHOD IS CALLED BEFORE GC "
				+ "TO PERFORM CLEAN UP OPERATION:");

	}

}
