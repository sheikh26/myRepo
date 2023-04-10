package com.javawithease.business;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * This class is used to show the use of 
 * Log4j with the BasicConfigurator.
 * @author javawithease
 */
public class Log4jTest {
	//Get the Logger object.
	private static Logger log = Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		//Configuring the Log4j, It will log all messages on console.
		//BasicConfigurator use ConsoleAppender and PatternLayout 
		//for all loggers.
		BasicConfigurator.configure();
		
		//logger messages
		log.debug("Log4j debug message test.");
		log.info("Log4j info message test.");		
	}
}
