package com.tyss.javaprogram.assignmentthree;

public class Friend {
	void give(Gift g) {
		System.out.println("gift recived");
	}

	public static void main(String[] args) {
		Gift g = new Gift();
		Friend f = new Friend();
		f.give(g);
	}


}
