package appium.utilities;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConfiguration {
    private static ExtentReports extent;
    private static ExtentSparkReporter spark;
        
    public static ExtentReports getInstance() {
    	if (extent == null) {
    		extent = new ExtentReports();
    		extent.attachReporter(getSpark());
    	}
    	return extent;
    }
    
    private static ExtentSparkReporter getSpark() {
    	spark = new ExtentSparkReporter("target/spark.html");
    	final File CONF = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\jsons\\spark-config.json");
    	
    	try {
			spark.loadJSONConfig(CONF);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	return spark;
    }
}
