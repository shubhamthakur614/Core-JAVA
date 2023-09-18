package com.String;

public class SCP_DEtails 
{
	public static void main(String[] args) 
	{
		String s1=new String("YOU CAN NOT CHANGE ME");//create object s1 in heap and scp
		String s2=new String("YOU CAN NOT CHANGE ME");//create object s2 in heap
		System.out.println(s1==s2);//false
		
		String s3="YOU CAN NOT CHANGE ME";//Allready object is created so point s3 to scp
		System.out.println(s1==s3);//false becz s1 is in heap and s3 in scp
		
		String s4="YOU CAN NOT CHANGE ME";//Allready object is created so point s3,s4 to scp	
		System.out.println(s3==s4);//true
		
		String s5="YOU CAN NOT "+"CHANGE ME";//Both the constant so it is perform by compiler at compile time only so it is same as s4,s3
		System.out.println(s4==s5);//true and Allready object is created so point s3,s4,s5 to scp
		
		String s6="YOU CAN NOT ";//create object in scp 
		String s7=s6+"CHANGE ME";//one is normal and one is constant so change me is created at scp and concate at run time in heap and
//		                          object will created in heap as you can not change me s7 pointing in heap
	
		
		System.out.println(s4==s7);//false becz s4 is in scp and s7 is pointing in heap
		
		final String s8="YOU CAN NOT ";//at compile time only so it is const
		String s9=s8+"CHANGE ME";//as final s8 and other statement is also final no object will created only it point to s3,s4,s5,s9
		System.out.println(s4==s9);
		
	}

}
