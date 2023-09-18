 class Myhash
{
	int i;
	public Myhash(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
	}
}
public class Hash_code2
{
	public static void main(String[] args) 
	{
		Myhash m1=new Myhash(16);//Myhash@32
		Myhash m2=new Myhash(100);//Myhash@64
		System.out.println(m1);
		System.out.println(m2);
		//we can get fix o/p becz we overriding the hash code of our own class so it is not going for object class
		//and we get @ becz we are not overriding tosting method in our class it given by object class
		
		//Public String toString() object class string method internally
		//{
		 //return getClass().getName()+"@"+Integer.toHexString(hashCode());
		//
		//}
		
		
//		if you pass two string s1="FB";
//		and String s2="Ea";
//		we get same hashcode for both
//		that means if hash code are can be same but dosent mean the object are same
//		but if object are same hash code must be same
		
	}

}
