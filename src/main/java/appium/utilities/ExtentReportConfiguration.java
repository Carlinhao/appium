package appium.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConfiguration {
    private static ExtentReports extent;
    private static ExtentSparkReporter spark;
    
    private static final String CODE1 = "{\n\"theme\":\"dark\",\n\"encoding\":\"utf-8\n}";
    private static final String CODE2 = "{\n\"protocol\":\"HTTPS\",\n\"timelineEnabled\":false\n}";
    
    public static ExtentReports getInstance() {
    	if (extent == null) {
    		extent = new ExtentReports();
    		extent.attachReporter(getSpark());
    	}
    	return extent;
    }
    
    private static ExtentSparkReporter getSpark() {
    	spark = new ExtentSparkReporter("target/Spark.html");    	
    	return spark;
    }
}
