package edu.penzgtu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 */
public class App {

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        // Было
        // System.out.println("Hello World!");
        
        // Стало
        logger.info("LOL!");   
    }
}
