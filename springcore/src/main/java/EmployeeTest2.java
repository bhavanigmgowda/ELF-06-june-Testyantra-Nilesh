import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest2 {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeBean bean = (EmployeeBean) applicationContext.getBean("employee1");
		Scanner s = new Scanner(System.in);
		log.info("Enter the name");
		bean.setName(s.nextLine());
		log.info("Enter the age");
		bean.setAge(s.nextInt());

		EmployeeBean bean1 = (EmployeeBean) applicationContext.getBean("employee1");
		s.nextLine(); // dummy nextLine()
		log.info("Enter the name");
		bean1.setName(s.nextLine());
		log.info("Enter the age");
		bean1.setAge(s.nextInt());
         s.close();
         
		// scope=prototype

		log.info("" + bean.getName());
		log.info("" + bean.getAge());

		log.info("" + bean1.getName());
		log.info("" + bean1.getAge());
		
		
		
		((AbstractApplicationContext)applicationContext).close();

	}// End of method
}// End of Class
