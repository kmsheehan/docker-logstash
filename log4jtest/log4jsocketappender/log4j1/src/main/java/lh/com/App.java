package lh.com;

import org.apache.log4j.Logger;

public class App
{
    static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        logger.info("Log4j 1 syslog appender test run successfully!!");
    }
}
