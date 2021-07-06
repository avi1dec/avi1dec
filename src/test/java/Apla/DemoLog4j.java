package Apla;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.*;


public class DemoLog4j {

	private static Logger log=(Logger) LogManager.getLogger(DemoLog4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 log.debug("I am debugging");
		 
		 log.error("This is error");
		 
		 log.info(" this is info message");
		 
		 log.fatal("this is Fatal error");
		 
	}

}
