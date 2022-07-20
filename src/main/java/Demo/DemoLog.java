package Demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class DemoLog 
{
	static Logger logger=LogManager.getLogger(DemoLog.class.getName());
	public static void Sample(int l)
	{
		if(l==1)
		{
			logger.trace("Traking");
		}
		else if(l==2)
		{
			logger.info("Started the test");
		}
		else if(l==3)
		{
			logger.error("Error occured");
		}
		else if(l==4)
		{
			logger.fatal("Fatal error occured");
		}
		else if(l==5)
		{
			logger.info("Ending the test");
		}
	}
}
