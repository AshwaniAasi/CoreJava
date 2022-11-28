package lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifeCycle/config.xml");
		System.out.println(context.getBean("ServiceXML"));
		context.registerShutdownHook();
	}
}
