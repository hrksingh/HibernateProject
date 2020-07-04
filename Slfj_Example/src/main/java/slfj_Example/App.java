package slfj_Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	String variable = "SLF4J Rocks!!!";
    	logger.error("Printing variable value: {}", variable);
    	
    	System.out.println("<--------------------------------------------------------------------------------------------->");
    	
    	logger.error("An exception occurred!", new Exception("Custom exception"));
    	
    	System.out.println("<--------------------------------------------------------------------------------------------->");
    	
        logger.error("{}, {}! An exception occurred!", "Hello", "World", new Exception("Custom exception"));
        
        System.out.println("<--------------------------------------------------------------------------------------------->");
    	
    	logger.trace("trace log message");
        logger.debug("debug log message");
        logger.info("info log message");
        logger.warn("warn log message");
        logger.error("error log message");
        
    }
}
