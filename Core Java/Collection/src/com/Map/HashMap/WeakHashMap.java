package com.Map.HashMap;
import java.util.*;
class Temp{
	public String toString() {
		return "temp";
	}

	public void finaliz() {
		System.out.println("Finallize method call only when the garbage collater empty the object");
	}
}

public class WeakHashMap  {
	public static void main(String[] args) throws Exception
	{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		
		//m.put(t,"Shubham");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);

	}

}
