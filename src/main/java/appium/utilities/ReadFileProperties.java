package appium.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFileProperties {
    private Properties properties = new Properties();
    private InputStream input = null;

    public ReadFileProperties(){
        try {
            input = new FileInputStream("./src/main/resources/config.properties");
            properties.load(input);
        } catch (IOException e) {
            System.out.println("File not found: config.properties" + e);
        }
    }

    public String url(){
        String urlServer = properties.getProperty("appium.url");
        if(urlServer!= null) return urlServer;
        else throw new RuntimeException("Path chrome driver not found");
    }
    public String appiumPort(){
        String port = properties.getProperty("appium.port");
        if(port!= null) return port;
        else throw new RuntimeException("Path chrome driver not found");
    }
}
