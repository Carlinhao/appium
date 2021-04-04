package appium.utilities;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConfiguration {
    private static ExtentReports extent;
    private static ExtentSparkReporter spark;
    private static ReadFileProperties _readFile;
    
    public ExtentReportConfiguration() {
    	_readFile = new ReadFileProperties();
    }
    public static ExtentReports getInstance() {
    	if (extent == null) {
    		extent = new ExtentReports();
    		extent.attachReporter(getSpark());
    	}
    	return extent;
    }
    
    private static ExtentSparkReporter getSpark() {
    	
    	spark = new ExtentSparkReporter("target/spark.html");
    	final File CONF = new File(_readFile.extentJsonPath());
    	
    	try {
			spark.loadJSONConfig(CONF);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	return spark;
    }
}
