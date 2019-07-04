package com.org.tyss.test;

import static org.junit.Assert.assertEquals;

import  org.junit.Test;

import com.tyss.filecreationutilnew.util.CreateFile;

import  junit.framework.Assert;


public class CreateFileUnitTest {
     
	private CreateFile cf=new CreateFile();
	
	@Test
	public void createFileTest()
	{
		boolean actual=cf.createFile("MyTest","hi everyone");
		boolean expected=true;
		
	    assertEquals(expected, actual);
	}
}
