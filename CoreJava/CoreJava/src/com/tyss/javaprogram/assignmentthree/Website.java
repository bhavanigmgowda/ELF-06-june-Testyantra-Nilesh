package com.tyss.javaprogram.assignmentthree;

public class Website {
    void search(int id)
    {
    	System.out.println("get empolyee by id");
    }
    
    void search(String name)
    {
    	System.out.println("get empoyee by name");
    }
    
    public static void main(String[] args) {
		Website w=new Website();
		w.search("Dinesh");
	}
}
