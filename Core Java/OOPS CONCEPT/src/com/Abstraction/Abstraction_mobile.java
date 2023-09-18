package com.Abstraction;

abstract class Phone {
	abstract public void phoneconfig();

}

class Iphone extends Phone {
	public void phoneconfig() {
		System.out.println("A13 Bionic Chip Price at 13,000,0");
	}
}

class Samsung extends Phone {
	public void phoneconfig() {
		System.out.println("XYNOS PROCESSOR 7854 PRICE AT 70,000 ");
	}
}

class Oneplus extends Phone {
	public void phoneconfig() {
		System.out.println("SNAPDRAGON 865 PRICE AT 47,000");
	}
}

class Vivo extends Phone {
	public void phoneconfig() {
		System.out.println("HELIO P30 PRICE AT 17,000");
	}
}

class Xiaomi extends Phone {
	public void phoneconfig() {
		System.out.println("SNAPFRAGON 720P PRICE AT 29,000");
	}
}

public class Abstraction_mobile 
{
	public static void main(String[] args) 
	{
		Phone iphone =new Iphone();
		Phone samsung=new Samsung();
		Phone vivo =new Vivo();
		Phone oneplus=new Oneplus();
		Phone xiaomi =new Xiaomi();
		show(oneplus);
	
	
	}
	
	public  static void  show(Phone obj)
	{
		obj.phoneconfig();
		
	}

}
