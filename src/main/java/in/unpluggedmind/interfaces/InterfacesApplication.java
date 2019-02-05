package in.unpluggedmind.interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "in.unpluggedmind.common", "in.unpluggedmind.controller" })
@ComponentScan
public class InterfacesApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(InterfacesApplication.class, args);
		System.out.println("[ ************************* Interfaces - ISO8583 to XML ************************* ]");
	}
	
	public static ApplicationContext getContext() {
		return context;
	}

}

