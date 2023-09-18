package com.String;


//String class Methods
//1)public char charAt(int index);
//2)public String .concat(Object o)
//3)public boolean equals(object o);
//4) EqualsIgnoreCase()
//5) public boolean isEmpty();
//6)public int length(); length variable is also in array but variable not method
//7)public String replace(char old,char new);
//8)public String substring(int starting index); 
//9)//public string substring(int beginning index,end index-1);
//10)public int indexOf();
//11)public int lastIndexOf();
//12)public String toUpperCase();
//13)public String toLowerCase();
//14)public String trim();
//15)public boolean contains(String s);
//16)//public boolean endssWith(String suffix);
//17)public static string join(delimiter,string) method
//18)public Static String valueOf(Object o);
//19)public char[] toCharArray(String s);
public class StringMethods 
{
	public static void main(String[] args)
	{
		//public char charAt(Index)
		
		String s=new String("SHUBHAM");
		System.out.println("using the charAt method:"+s.charAt(5));
        
		//public String concat(String of another);
		
		String s2="SHUBHAM";
		String s3="THAKUR";
		System.out.println(s2.concat(s3));
		String s4=s2+s3;
		System.out.println(s4);
		System.out.println(s2+=s3);
		
		//Equals method and EqualsIgnoreCase()
		String s5=new String("SHUBHAM");
		String s6="SHUBHAM";
		String s7="shubham";
		System.out.println("EQUALS METHODS: "+s5.equals(s6));
		System.out.println("equalsIgnoreCase():"+s6.equalsIgnoreCase(s7));
		
		//public boolean isEmpty()
		
		String s8="";
        String s9="SHUBHAM";
        System.out.println("String isEmpty() "+s8.isEmpty());
        System.out.println("String isEmpty() "+s9.isEmpty());
		
        //public int length();
        
        String s10="SHUBHAM";
        System.out.println("THE LENGTH OF STRING USING length():"+s10.length());
        
        //public String replace (char old,char new);
        
        String s11="Shubham";
        System.out.println("Replacing the 'H' character using replace() "+s11.replace('h', 'x'));
        
        //public String replaceAll(String regex,string);
        String srep="SHUBHAM WHY ARE YOU SEARCHING FOR JOB";
        System.out.println("STRING REPLACEALL():"+srep.replaceAll( "S","Z"));
        
        //public String substring(int starting index);
        
        String s12="MIA KHALIFA";
        System.out.println("STRING substring():"+s12.substring(2));
        
        //public string substring(int beginning index,end index-1);
        
        String s13="MIA KHALIFA";
        System.out.println("String substring():"+s13.substring(2,9));
		
        //public int indexOf();
        
        String s14="DOREMON";
        System.out.println("indexOf method "+s14.indexOf("O"));
        
        //public int lastIndexOf()
        
        String s15="DOREMON";
        System.out.println("lastIndexOf method: "+s15.lastIndexOf("O"));
        
      //public String toUpperCase();
        
        String s16="shinchang";
        System.out.println("toUpperCase method:"+s16.toUpperCase());
        
      //public String toLowerCase()
        
        
        System.out.println("toLowerCase method:"+s16.toLowerCase());
        
        //public String trim()
        
        String s17="  SHUBHAM THAKUR ";
        System.out.println(s17);
        System.out.println(s17.trim()+"IS GOOD PERSON");
        
        //public boolean contains(String s)
        
        String s18="I AM FOUND OF JOB";
        System.out.println("CONTAINS METHOD FIND THE STRING TEXT:"+s18.contains("FOUND"));
        
        //public boolean endsWith(String suffix);
        String s19="RAKESH IS GOOD GUY";
        System.out.println(s19.endsWith("GUY"));
        
        //public static string join(delimeter,string) method
        
        String s20=String.join("-","SHUBHAM","IS","VERY","GOOD","GUY");
        System.out.println(s20);
        
        String s21=String.join("/", "13","04","1996");
        String s22=String.join(":", "10","12","40");
        System.out.println(s21+" "+s22);
        
        //public Static String valueOf(Object o);
        float a=23.24f;//if you want to convert any type to string
        String s23=String.valueOf(a);
        System.out.println("Converting float to String:"+s23);
        
        //public char toCharArray(String s)
        String s24="SHUBHAM THAKUR";
        char[] c=s24.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        	System.out.print(c[i]);
        }
        
        
        
        
        		
        
		
	}

}
