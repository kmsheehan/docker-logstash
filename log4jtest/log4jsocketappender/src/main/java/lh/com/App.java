package lh.com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    static final Logger logger = LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //These logs will be sent to socket server as configured in log4j.xml
        logger.error("Log4j socket appender test run successfully!!");
    }
}
