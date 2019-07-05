package com.tyss.myjavaapptwo;

import com.tyss.filecreationutilnew.bean.EmployeeInfoBean;
import com.tyss.filecreationutilnew.util.CreateFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	CreateFile createFile=new CreateFile();
    	createFile.createFile("myfile","Maven Started");
    	
    	EmployeeInfoBean infoBean=new EmployeeInfoBean();
    	infoBean.toString();
    }
}
