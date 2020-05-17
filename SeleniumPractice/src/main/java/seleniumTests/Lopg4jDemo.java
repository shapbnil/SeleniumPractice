package seleniumTests;

import org.apache.log4j.Logger;

public class Lopg4jDemo {

	static Logger log = Logger.getLogger(Lopg4jDemo.class.getName());
	
	public static void main(String[] args) {
		log.debug("Debug message");
		log.info("info message");
	}
}
