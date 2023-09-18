package com.Multithreding;

class Booking {
	int total_seat = 10;

	  public void ticket(int seat, String name) 
	 {
		 System.out.println("WELCOME TO TICKET BOOKING APP");
		 System.out.println("WELCOME TO TICKET BOOKING APP");
		 System.out.println("WELCOME TO TICKET BOOKING APP");
		 System.out.println("WELCOME TO TICKET BOOKING APP");
		synchronized (this)
		{ 
			if (total_seat > seat)
			{
				System.out.println(name+" Your "+seat+ " Seat are Booked Successfully!!!!!!!!!!!");
				total_seat = total_seat - seat;
				System.out.println("Remaing Seat are:" + total_seat);
			} 
			
			else {
				System.out.println(name+" Your " +seat+" Seat are not Booked!!!!!!!!!!" );
				System.out.println("Remaing Seats Are:" + total_seat);
	
			}
		}
		System.out.println("Thank you for Booking Tickets From Our APP!!!!!!!");
		System.out.println("Thank you for Booking Tickets From Our APP!!!!!!!");
		System.out.println("Thank you for Booking Tickets From Our APP!!!!!!!");
		System.out.println("Thank you for Booking Tickets From Our APP!!!!!!!");
	}
}

class Ticket_counter extends Thread {
	Booking b;
	int seat;
	String name;

	public Ticket_counter(Booking b, int seat, String name) {
		this.b = b;
		this.seat = seat;
		this.name = name;
	}

	public void run() 
	{
		b.ticket(seat,name);

	}

}

public class MovieTicketBooking {

	public static void main(String[] args)
	{
		Booking b=new Booking();
		Ticket_counter shubham=new Ticket_counter(b,7,"Shubham");
		Ticket_counter viraj=new Ticket_counter(b,6,"Viraj");
		shubham.start();
		viraj.start();
		

	}

}
