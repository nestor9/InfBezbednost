package Ib.IbProjectShell;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
	
	private static String DATA_DIR_PATH;
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
	static {
		ResourceBundle rb = ResourceBundle.getBundle("application");
		DATA_DIR_PATH = rb.getString("dataDir");
	}
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
