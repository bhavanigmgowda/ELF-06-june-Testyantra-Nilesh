package com.tyss.javapogram.basicexample;

public class TicketGentrator 
{
	public static void main(String[] args) {
		int age=75;
		double ticketPrice=100;
		if(age>=50)
		{
			ticketPrice=ticketPrice-((ticketPrice*15.2)/100);
		}
		
		
			System.out.println("ticket price"+ticketPrice);
		
	}
}
